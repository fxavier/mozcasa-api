package com.xavier.mozcasa_api.service.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class BusnessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final HttpStatus status;

    private final String code;

    public BusnessException(String message, HttpStatus status, String code) {
        super(message);
        this.status = status;
        this.code = code;
    }

    public BusnessException(String message, HttpStatus status, String code, Throwable cause) {
        super(message, cause);
        this.status = status;
        this.code = code;
    }
    
}
