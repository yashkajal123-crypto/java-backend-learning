package com.telusko.SpringbootMavenApp.controller;

import com.telusko.SpringbootMavenApp.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/api/greeting")
    public String greeting(
            @RequestParam(defaultValue = "Guest") String name) {

        return greetingService.createGreeting(name);
    }

    @GetMapping("/api/time")
    public String getServerTime() {

        LocalDateTime currentTime = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return currentTime.format(formatter);
    }
}