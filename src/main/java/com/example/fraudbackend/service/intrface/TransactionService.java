package com.example.fraudbackend.service.intrface;

import com.example.fraudbackend.dto.request.TransactionRequestDTO;
import com.example.fraudbackend.dto.response.TransactionResponseDTO;

public interface TransactionService {
    TransactionResponseDTO saveTransaction(TransactionRequestDTO transaction);
}
