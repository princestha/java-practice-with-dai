package com.java.practice.repository.impl;

import com.java.practice.advice.exception.CustomerNotAvailableException;
import com.java.practice.repository.CarInsuranceRepository;
import com.java.practice.repository.domain.CarOwnerRepositoryDto;
import org.springframework.stereotype.Repository;

@Repository
public class CarInsuranceRepositoryImpl implements CarInsuranceRepository {
    @Override
    public boolean getCustomerCarInsuranceStatusByCustomerId(int customerId) throws CustomerNotAvailableException {
        switch (customerId) {
            case 1:
            case 5:
                return true;
            case 2:
            case 3:
            case 6:
                return false;
            default:
                throw new CustomerNotAvailableException();
        }
    }
}
