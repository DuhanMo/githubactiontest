package com.example.githubactiontest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/home")
    public String home() {
        return "ci test";
    }
}
