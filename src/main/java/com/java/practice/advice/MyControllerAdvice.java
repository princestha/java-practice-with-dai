package com.java.practice.advice;

import com.java.practice.advice.exception.CustomerNotAvailableException;
import com.java.practice.domain.ErrorMessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public String handleException(Exception ex) {
        return ex.getMessage();
    }


    @ExceptionHandler(CustomerNotAvailableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorMessageDto handleCustomerNotAvailableException(CustomerNotAvailableException ex) {
        return new ErrorMessageDto(HttpStatus.BAD_REQUEST.value(), "Customer Does Not Exist!");
    }

}
