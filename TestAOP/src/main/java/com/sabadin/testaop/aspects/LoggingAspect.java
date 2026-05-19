package com.sabadin.testaop.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LoggingAspect {

    @Pointcut("within(com.sabadin.testaop.service.MainService)") // Выбираем все методы класса MainService
    public void springProcessingMethod(){}

    @Pointcut("@annotation(LogExecutionTime)")
    public void springProcessingMethodWithLogAnnotation(){}

    @After("springProcessingMethod()")
    public void logMethodCall(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        log.info("LoggingAspect -> logMethodCall; Method name: {}", methodName);
    }

    @AfterReturning(pointcut = "springProcessingMethod()", returning = "result")
    public void logAfterReturning(JoinPoint jp, Object result) {
        log.info("LoggingAspect -> logAfterReturning; Returning value: {}", result.toString());
    }

    @Around("springProcessingMethodWithLogAnnotation()")
    public Object logLeadTimeOfMethod(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.nanoTime();
        Object proceed = pjp.proceed();
        String methodName = pjp.getSignature().getName();
        long end = System.nanoTime();
        long executionTime = end - start;
        log.info("LoggingAspect -> logLeadTimeOfMethod; Method name: {}, Execution time: {} ms.", methodName, (executionTime / 1_000_000));
        return proceed;
    }

    @Around("springProcessingMethod() && args(s1, s2)")
    public Object loadAroundWithArgs(ProceedingJoinPoint pjp, String s1, String s2) throws Throwable {
        log.info("Before LoggingAspect -> loadAroundWithArgs; Method name: {}, args: s1 = {}, s2 = {}", pjp.getSignature().getName(), s1, s2);
        Object proceed = pjp.proceed();
        log.info("After LoggingAspect -> loadAroundWithArgs");
        return proceed;
    }
}
