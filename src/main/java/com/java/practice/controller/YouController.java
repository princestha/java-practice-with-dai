package com.java.practice.controller;

import com.java.practice.services.YouServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YouController {

    @Autowired
    private YouServices youServices;

    @RequestMapping("/api/you/{yourName}")
    public String myMessage(@PathVariable("yourName") String yourName) {
        return youServices.getMessage(yourName);
    }

}
