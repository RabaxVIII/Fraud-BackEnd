package com.example.fraudbackend.common;

import com.example.fraudbackend.common.enums.ErrorType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }

    public static <T extends BaseResponse> T createSuccessResponse(T response) {
        response.setSuccess(true);
        return response;
    }

    public static <T extends BaseResponse> T createSuccessWithInfoResponse(T response, String message) {
        response.setSuccess(true);

        Result result = new Result();
        result.setMessage(message != null ? message : "Operation completed successfully.");
        result.setErrorType(ErrorType.INFO);

        if (response.getResults() == null) {
            response.setResults(new ArrayList<>());
        }

        response.getResults().add(result);

        return response;
    }
}
