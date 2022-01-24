package com.java.practice.services.impl;

import com.java.practice.domain.AddressDto;
import com.java.practice.services.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public AddressDto getCustomerAddressInfoByCustomerId(int customerId, boolean getZipcode) throws Exception {
        AddressDto addressDto;

        if(customerId == 1) {
            addressDto = new AddressDto("Customer 1 Street", "Customer 1 City", "Customer 1 State");
            if(getZipcode) {
                addressDto.setZipcode(123456);
            }
        } else if(customerId == 2) {
            addressDto = new AddressDto("Customer 2 Street", "Customer 2 City", "Customer 2 State");
            if(getZipcode) {
                addressDto.setZipcode(987654);
            }
        } else {
            throw new Exception("Customer not found");
        }

        return addressDto;
    }
}
