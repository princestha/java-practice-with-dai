package com.java.practice.controller;

import com.java.practice.domain.AddressDto;
import com.java.practice.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/{customerId}")
    public AddressDto getCustomerAddressByCustomerId(@PathVariable("customerId") int customerId, @RequestParam(value = "zipcode", defaultValue = "false") boolean getZipcode) throws Exception {
        return addressService.getCustomerAddressInfoByCustomerId(customerId, getZipcode);
    }
}
