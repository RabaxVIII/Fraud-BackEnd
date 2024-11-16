package com.example.fraudbackend.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorType {
    SYSTEM_ERROR(1),
    INFO(2),
    WARN(3),
    VALIDATION_ERROR(4),
    AUTHORIZATION_ERROR(5),
    DATABASE_ERROR(6);

    private final int code;
}
