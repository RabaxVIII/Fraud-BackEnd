package com.example.fraudbackend.mapper;

import com.example.fraudbackend.dto.request.TransactionRequestDTO;
import com.example.fraudbackend.dto.response.TransactionResponseDTO;
import com.example.fraudbackend.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.example.fraudbackend.common.enums.TransactionStatus;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    Transaction toTransactionEntity(TransactionRequestDTO dto);

    TransactionResponseDTO toTransactionResponseDTO(Transaction entity);
}
