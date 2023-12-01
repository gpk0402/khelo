package com.khelo.exception;

import org.springframework.http.HttpStatus;

public class PlayerException extends RuntimeException{

    private final HttpStatus httpStatus;
    public PlayerException(String message){
        super(message);
        this.httpStatus = null;

    }

    public PlayerException(String message, HttpStatus httpStatus){
        super(message);
        this.httpStatus = httpStatus;
    }
}
