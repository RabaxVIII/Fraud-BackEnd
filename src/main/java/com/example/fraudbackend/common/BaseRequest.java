package com.example.fraudbackend.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseRequest {
    private Short channel;
    private Long key;
}
