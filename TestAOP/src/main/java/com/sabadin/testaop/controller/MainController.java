package com.sabadin.testaop.controller;

import com.sabadin.testaop.service.MainService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/aop")
@AllArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping
    public String startSomeMethod() {
        return mainService.method1();
    }

    @GetMapping("/2")
    public String startMethod2() {
        return mainService.method2("This is the string 1", "It string number two");
    }
}
