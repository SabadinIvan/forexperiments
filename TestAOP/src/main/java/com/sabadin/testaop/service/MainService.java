package com.sabadin.testaop.service;

import com.sabadin.testaop.aspects.LogExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MainService {

    @LogExecutionTime
    public String method1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Called MainService -> method1";
    }

    public String method2(String str1, String str2) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Called MainService -> method2";
    }
}
