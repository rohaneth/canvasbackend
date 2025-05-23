package com.example.canvac1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {

    @GetMapping("/")
    public String ping() {
        return "pong";
    }
    @GetMapping("/ping")
    public String hello() {
        return "pong";
    }
}
