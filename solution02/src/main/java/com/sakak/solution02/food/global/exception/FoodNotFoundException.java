package com.sakak.solution02.food.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FoodNotFoundException extends RuntimeException {
    private ExceptionEnum error;

    public FoodNotFoundException(ExceptionEnum e) {
        super(e.getMessage());
        this.error = e;
    }

    public ExceptionEnum getError() {
        return error;
    }
}