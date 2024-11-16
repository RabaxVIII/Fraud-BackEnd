package com.example.fraudbackend.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TransactionStatus {

    NOT_INVESTIGATED(1),
    PROCESSING(2),
    HOLD(3),
    NOT_FRAUD(4),
    FRAUD(5);

    private final int code;

    public static TransactionStatus fromCode(int code) {
        for (TransactionStatus status : TransactionStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }
}