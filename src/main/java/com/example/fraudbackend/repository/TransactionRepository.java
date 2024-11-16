package com.example.fraudbackend.repository;

import com.example.fraudbackend.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
