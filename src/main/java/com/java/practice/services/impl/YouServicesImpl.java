package com.java.practice.services.impl;

import com.java.practice.services.YouServices;
import org.springframework.stereotype.Service;

@Service
public class YouServicesImpl implements YouServices {

    @Override
    public String getMessage(String yourName) {
        return "My name is " + yourName + " and I am getting better at controllers";
    }
}