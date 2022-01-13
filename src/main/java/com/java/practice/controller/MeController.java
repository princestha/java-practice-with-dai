package com.java.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeController {
    @RequestMapping("/api/me")
    public String api() {
        return "Hello my name is Sanjeev1920 and I am learning how to create controllers";
    }
}
