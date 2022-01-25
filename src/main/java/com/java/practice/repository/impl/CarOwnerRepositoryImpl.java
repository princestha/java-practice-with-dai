package com.java.practice.repository.impl;

import com.java.practice.advice.exception.CustomerNotAvailableException;
import com.java.practice.repository.CarOwnerRepository;
import com.java.practice.repository.domain.CarOwnerRepositoryDto;
import org.springframework.stereotype.Repository;

@Repository
public class CarOwnerRepositoryImpl implements CarOwnerRepository {
    @Override
    public CarOwnerRepositoryDto getCarInformationByCustomerId(int customerId) throws CustomerNotAvailableException {
        CarOwnerRepositoryDto carOwnerRepositoryDto;

        switch (customerId) {
            case 1:
                carOwnerRepositoryDto = new CarOwnerRepositoryDto("Ford", 3, false);
                break;
            case 2:
                carOwnerRepositoryDto = new CarOwnerRepositoryDto("Honda", 6, false);
                break;
            case 3:
                carOwnerRepositoryDto = new CarOwnerRepositoryDto("Audi", 5, true);
                break;
            case 5:
                carOwnerRepositoryDto = new CarOwnerRepositoryDto("Toyota", 4, true);
                break;
            case 6:
                carOwnerRepositoryDto = new CarOwnerRepositoryDto("Fiat", 2, false);
                break;
            default:
                throw new CustomerNotAvailableException();
        }
        return carOwnerRepositoryDto;
    }
}
