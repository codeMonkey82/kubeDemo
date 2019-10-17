package com.demo.services.manager;

import com.demo.services.client.BetaServiceClient;
import com.demo.services.schema.StatusBeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class BetaManager {
    @Autowired
    BetaServiceClient betaClient;

    public ResponseEntity<StatusBeta> getBetaStatus() {
        return this.betaClient.getStatusBeta();
    }
}