package com.demo.services.controller;

import com.demo.services.manager.AlphaManager;
import com.demo.services.manager.BetaManager;
import com.demo.services.schema.BetaApi;
import com.demo.services.schema.StatusAlpha;
import com.demo.services.schema.StatusBeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BetaController implements BetaApi {
    @Autowired
    AlphaManager alphaManager;

    @Autowired
    BetaManager betaManager;

    @Override
    public ResponseEntity<StatusAlpha> getStatusAlpha() {
        return this.alphaManager.getAlphaStatus();
    }

    @Override
    public ResponseEntity<StatusBeta> getStatusBeta() {
        return new ResponseEntity<>(this.betaManager.getStatusBeta(), HttpStatus.OK);
    }
}
