package com.tiagoramirez.portfolio.exception;

import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {
    private final String internalError;

    public BaseException(String internalError, String message, Throwable cause) {
        super(message, cause);
        this.internalError = internalError;
    }
}
