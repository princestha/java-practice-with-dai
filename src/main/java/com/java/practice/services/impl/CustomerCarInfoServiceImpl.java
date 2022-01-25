package com.java.practice.services.impl;

import com.java.practice.advice.exception.CustomerNotAvailableException;
import com.java.practice.domain.CustomerCarInfoDto;
import com.java.practice.repository.CarInsuranceRepository;
import com.java.practice.repository.CarOwnerRepository;
import com.java.practice.repository.domain.CarOwnerRepositoryDto;
import com.java.practice.services.CustomerCarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerCarInfoServiceImpl implements CustomerCarInfoService {

    @Autowired
    CarOwnerRepository carOwnerRepository;

    @Autowired
    CarInsuranceRepository carInsuranceRepository;

    @Override
    public CustomerCarInfoDto getCustomerCarInfoByCustomerId(int customerId) throws CustomerNotAvailableException {

        CustomerCarInfoDto customerCarInfoDto;

        //Step 1 = Get the customer initial car information
        CarOwnerRepositoryDto carOwnerInfoRepositoryDto = carOwnerRepository.getCarInformationByCustomerId(customerId);

        if (carOwnerInfoRepositoryDto != null) {
            customerCarInfoDto = new CustomerCarInfoDto(carOwnerInfoRepositoryDto.getCarModel(), carOwnerInfoRepositoryDto.getCarSeats(), carOwnerInfoRepositoryDto.isSuv());
        } else {
            throw new CustomerNotAvailableException();
        }

        //Step 2 = Get the customer insurance information
        customerCarInfoDto.setInsured(carInsuranceRepository.getCustomerCarInsuranceStatusByCustomerId(customerId));

        return customerCarInfoDto;
    }
}
