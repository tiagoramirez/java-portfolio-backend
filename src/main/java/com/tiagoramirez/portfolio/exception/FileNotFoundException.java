package com.tiagoramirez.portfolio.exception;

public class FileNotFoundException extends BaseException {
    public FileNotFoundException(String internalError, String message, Throwable cause) {
        super(internalError, message, cause);
    }
}
