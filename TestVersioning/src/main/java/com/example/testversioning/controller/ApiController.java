package com.example.testversioning.controller;

import com.example.testversioning.dto.TestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping(path = "/test", version = "1")
    public TestDto oldGreeting() {
        return new TestDto("Привет! API версия 1");
    }

    @GetMapping(path = "/test", version = "2")
    public TestDto newGreeting(@RequestParam String name) {
        return new TestDto(String.format("Привет, %s! API версия 2", name));
    }
}
