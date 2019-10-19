package com.demo.services.controller;

import com.demo.services.manager.AlphaManager;
import com.demo.services.manager.BetaManager;
import com.demo.services.schema.*;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AlphaController implements AlphaApi {
    @Autowired
    AlphaManager alphaManager;

    @Autowired
    BetaManager betaManager;

    @Override
    public ResponseEntity<StatusAlpha> createStatusAlpha(@Valid StatusAlphaSchema inStatusAlphaSchema) {
        return new ResponseEntity<>(this.alphaManager.getStatusAlpha(), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> deleteStatusAlpha(Integer statusId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

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
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<StatusAlpha> updateStatusAlpha(Integer statusId, @Valid StatusAlphaSchema inStatusAlphaSchema) {
        if (statusId > 0) {
            return new ResponseEntity<>(this.alphaManager.getStatusAlpha(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

/*    @Override
    public ResponseEntity<Void> alphaStatusAlphaDelete(Integer statusId) {
        if (statusId > 0) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<StatusAlpha> alphaStatusAlphaPost() {
        return new ResponseEntity<>(this.alphaManager.getStatusAlpha(), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<StatusAlpha> alphaStatusAlphaPut(Object statusId) {
        return new ResponseEntity<>(this.alphaManager.getStatusAlpha(), HttpStatus.OK);
    }*/
}
