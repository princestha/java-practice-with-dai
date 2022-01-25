package com.java.practice.repository;

import com.java.practice.advice.exception.CustomerNotAvailableException;
import com.java.practice.repository.domain.CarOwnerRepositoryDto;

public interface CarOwnerRepository {

    public CarOwnerRepositoryDto getCarInformationByCustomerId(int customerId) throws CustomerNotAvailableException;

}
