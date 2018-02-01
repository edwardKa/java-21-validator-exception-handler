package com.employee.controller;

import com.employee.exception.InputValidationException;
import com.employee.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(value = InputValidationException.class)
    public ResponseEntity<ErrorResponse> getErrorResponse(InputValidationException e) {
        e.printStackTrace();
        return new ResponseEntity<>(e.getErrorResponse(), HttpStatus.BAD_REQUEST);
    }
}
