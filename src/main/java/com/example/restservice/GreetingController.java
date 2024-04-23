package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    @GetMapping("/")
    public String greeting(@RequestParam(value = "name", defaultValue = "Spring") String name) {
        return "Hello " + name;
    }
}
