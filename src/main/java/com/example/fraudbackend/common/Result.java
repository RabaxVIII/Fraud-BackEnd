package com.example.fraudbackend.common;

import com.example.fraudbackend.common.enums.ErrorType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    private String message;
    private String errorCode;
    private ErrorType errorType;
    private Exception exception;
}
