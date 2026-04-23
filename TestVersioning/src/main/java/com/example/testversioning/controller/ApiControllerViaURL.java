package com.example.testversioning.controller;

import com.example.testversioning.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v{version}")
public class ApiControllerViaURL {

    @GetMapping(path = "/test", version = "3")
    public TestDto oldGreeting() {
        return new TestDto("Привет! API версия 3");
    }

    @GetMapping(path = "/test", version = "4")
    public TestDto newGreeting(@RequestParam String name) {
        return new TestDto(String.format("Привет, %s! API версия 4", name));
    }
}
