package com.telusko.SpringbootMavenApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String createGreeting(String name) {

        if (name == null || name.trim().isEmpty()) {
            return "Hello, Guest! 👋";
        }

        return "Hello, " + name.trim() + "! 👋";
    }
}