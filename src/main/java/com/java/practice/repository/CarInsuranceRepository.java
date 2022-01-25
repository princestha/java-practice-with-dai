package com.java.practice.repository;

import com.java.practice.advice.exception.CustomerNotAvailableException;
import com.java.practice.repository.domain.CarOwnerRepositoryDto;

public interface CarInsuranceRepository {

    public boolean getCustomerCarInsuranceStatusByCustomerId(int customerId) throws CustomerNotAvailableException;

}
