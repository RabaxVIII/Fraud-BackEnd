package com.example.fraudbackend.controller;

import com.example.fraudbackend.service.intrface.FraudCheckService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fraud-check")
public class FraudCheckController {

    private final FraudCheckService fraudCheckService;


    public FraudCheckController(FraudCheckService fraudCheckService) {
        this.fraudCheckService = fraudCheckService;
    }
    @GetMapping("/IsHealthy")
    public boolean isHealthy() {
        return fraudCheckService.IsHealthy();
    }
}
