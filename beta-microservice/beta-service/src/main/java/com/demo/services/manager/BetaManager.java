package com.demo.services.manager;

import com.demo.services.schema.StatusBeta;
import org.springframework.stereotype.Component;

@Component
public class BetaManager {
    final static String DEFAULT_STATUS = "Beta Service: ALIVE!!!";

    public StatusBeta getStatusBeta() {
        final StatusBeta status = new StatusBeta();
        status.setResult(DEFAULT_STATUS);
        return status;
    }
}
