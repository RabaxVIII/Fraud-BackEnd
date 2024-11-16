package com.example.fraudbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer accountId;
    private String transactionCode;
    private Long amount;
    private String receiver;
    private String description;
    private Boolean fraudCheckNeed;
    private String ip;
    private LocalDateTime systemDate;
    private Integer status;
}
