package com.journal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class HealthCheck {

    @GetMapping("/test")
    public String healthCheck(){
        return "OK ...";
    }
}
