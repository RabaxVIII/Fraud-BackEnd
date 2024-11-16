package com.example.fraudbackend.exception;

import com.example.fraudbackend.common.BaseResponse;
import com.example.fraudbackend.common.Result;
import com.example.fraudbackend.common.enums.ErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.dao.DataAccessException;

import java.util.ArrayList;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<BaseResponse> handleGeneralException(Exception ex) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(false);

        Result result = new Result();
        result.setMessage("handleGeneralException");
        result.setErrorType(ErrorType.SYSTEM_ERROR);
        result.setException(ex);

        if (response.getResults() == null) {
            response.setResults(new ArrayList<>());
        }

        response.getResults().add(result);

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity<BaseResponse> handleDatabaseException(DataAccessException ex) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(false);

        Result result = new Result();
        result.setMessage("handleDatabaseException");
        result.setErrorType(ErrorType.DATABASE_ERROR);
        result.setException(ex);

        if (response.getResults() == null) {
            response.setResults(new ArrayList<>());
        }

        response.getResults().add(result);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
