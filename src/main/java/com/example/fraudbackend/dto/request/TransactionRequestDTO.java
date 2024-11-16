package com.example.fraudbackend.dto.request;

import com.example.fraudbackend.common.BaseRequest;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionRequestDTO extends BaseRequest {
    private Integer accountId;
    private String transactionCode;
    private Long amount;
    private String receiver;
    private String description;
    private Boolean fraudCheckNeed;
    private String ip;
    private LocalDateTime systemDate;
}
