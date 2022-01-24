package com.java.practice.services;

import com.java.practice.domain.AddressDto;

public interface AddressService {

    public AddressDto getCustomerAddressInfoByCustomerId(int customerId, boolean getZipcode) throws Exception;

}
