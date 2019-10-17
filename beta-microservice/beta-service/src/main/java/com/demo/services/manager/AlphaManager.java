package com.demo.services.manager;

import com.demo.services.client.AlphaServiceClient;
import com.demo.services.schema.StatusAlpha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AlphaManager {
    private AlphaServiceClient alphaClient;

    @Autowired
    AlphaManager(AlphaServiceClient client) {
        alphaClient = client;
    }

    public ResponseEntity<StatusAlpha> getAlphaStatus() {
        return this.alphaClient.getStatusAlpha();
    }
}
