package com.example.fraudbackend.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BaseResponse {
    private Boolean success;
    private Long key;
    private List<Result> results;
}
