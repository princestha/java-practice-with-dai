package com.java.practice.controller;

import com.java.practice.advice.exception.CustomerNotAvailableException;
import com.java.practice.domain.CustomerCarInfoDto;
import com.java.practice.services.CustomerCarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer/car")
public class CustomerCarController {

    @Autowired
    CustomerCarInfoService customerCarInfoService;

    @GetMapping("/{customerId}")
    public CustomerCarInfoDto getCustomerCarInformationByCustomerId(@PathVariable("customerId") int customerId) throws CustomerNotAvailableException {
        return customerCarInfoService.getCustomerCarInfoByCustomerId(customerId);
    }
}
