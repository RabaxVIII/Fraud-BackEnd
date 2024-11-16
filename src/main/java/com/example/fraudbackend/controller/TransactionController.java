package com.example.fraudbackend.controller;

import com.example.fraudbackend.dto.request.TransactionRequestDTO;
import com.example.fraudbackend.dto.response.TransactionResponseDTO;
import com.example.fraudbackend.service.intrface.TransactionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @PostMapping("/save")
    public TransactionResponseDTO saveTransaction(@RequestBody TransactionRequestDTO transaction) {
        return transactionService.saveTransaction(transaction);
    }
}
