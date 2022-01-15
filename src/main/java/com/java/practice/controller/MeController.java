package com.java.practice.controller;

import com.java.practice.controller.services.MeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeController {

    @Autowired
    private MeServices meServices;

    @RequestMapping("/api/me")
    public String api() {
        return meServices.getMyName();
    }
}
