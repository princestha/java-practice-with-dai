package com.java.practice.services.impl;

import com.java.practice.services.MeServices;
import org.springframework.stereotype.Service;

@Service
public class MeServicesImpl implements MeServices {

    @Override
    public String getMyName() {
        return "Hello my name is Sanjeev1920 and I am learning how to create controllers";
    }
}
