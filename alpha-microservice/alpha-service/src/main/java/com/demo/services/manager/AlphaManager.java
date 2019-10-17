package com.demo.services.manager;

import com.demo.services.schema.StatusAlpha;
import org.springframework.stereotype.Component;

@Component
public class AlphaManager {
    final static String DEFAULT_STATUS = "Alpha Service: ALIVE!!!";

    public StatusAlpha getStatusAlpha() {
        final StatusAlpha status = new StatusAlpha();
        status.setResult(DEFAULT_STATUS);
        return status;
    }
}
