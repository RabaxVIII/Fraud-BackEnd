package com.example.fraudbackend.service.Impl;

import com.example.fraudbackend.common.enums.TransactionStatus;
import com.example.fraudbackend.dto.request.TransactionRequestDTO;
import com.example.fraudbackend.dto.response.TransactionResponseDTO;
import com.example.fraudbackend.entity.Transaction;
import com.example.fraudbackend.mapper.TransactionMapper;
import com.example.fraudbackend.repository.TransactionRepository;
import com.example.fraudbackend.service.intrface.TransactionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

import static com.example.fraudbackend.common.Utils.createSuccessResponse;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private TransactionMapper transactionMapper;

    @Override
    @Transactional
    public TransactionResponseDTO saveTransaction(TransactionRequestDTO dto) {
        var returnObject = new TransactionResponseDTO();

        Transaction transaction = transactionMapper.toTransactionEntity(dto);
        transaction.setSystemDate(LocalDateTime.now());
        Transaction savedTransaction = transactionRepository.save(transaction);

        //inceleme

        returnObject = transactionMapper.toTransactionResponseDTO(savedTransaction);
        returnObject.setId(savedTransaction.getId());
        //returnObject.setTransactionStatus(TransactionStatus.fromCode(savedTransaction.getStatus()));

        createSuccessResponse(returnObject);
        return returnObject;
    }
}
