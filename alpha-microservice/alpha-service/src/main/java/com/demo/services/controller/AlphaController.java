package com.demo.services.controller;

import com.demo.services.manager.AlphaManager;
import com.demo.services.manager.BetaManager;
import com.demo.services.schema.AlphaApi;
import com.demo.services.schema.StatusAlpha;
import com.demo.services.schema.StatusBeta;
import com.demo.services.schema.StatusGamma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlphaController implements AlphaApi {
    @Autowired
    AlphaManager alphaManager;

    @Autowired
    BetaManager betaManager;

    @Override
    public ResponseEntity<StatusAlpha> getStatusAlpha() {
        return new ResponseEntity<>(this.alphaManager.getStatusAlpha(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StatusBeta> getStatusBeta() {
        return this.betaManager.getBetaStatus();
    }

    @Override
    public ResponseEntity<StatusGamma> getStatusGamma() {
        return null;
    }
}
