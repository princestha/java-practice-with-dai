package com.java.practice.services;

import com.java.practice.advice.exception.CustomerNotAvailableException;
import com.java.practice.domain.CustomerCarInfoDto;

public interface CustomerCarInfoService {

    public CustomerCarInfoDto getCustomerCarInfoByCustomerId(int customerId) throws CustomerNotAvailableException;

}
