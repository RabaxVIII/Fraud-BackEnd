package com.example.fraudbackend.dto.response;

import com.example.fraudbackend.common.BaseResponse;
import com.example.fraudbackend.common.enums.TransactionStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionResponseDTO extends BaseResponse {
    private Long id;
    private TransactionStatus transactionStatus;
}
