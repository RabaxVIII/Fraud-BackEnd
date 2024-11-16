package com.example.fraudbackend.service.Impl;

import com.example.fraudbackend.service.intrface.FraudCheckService;
import org.springframework.stereotype.Service;

@Service
public class FraudCheckServiceImpl implements FraudCheckService {

    @Override
    public boolean IsHealthy() {
        return true;
    }
}
