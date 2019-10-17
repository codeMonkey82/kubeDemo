package com.demo.services.configuration;

import com.demo.services.client.BetaServiceClient;
import com.demo.services.schema.StatusAlpha;
import com.demo.services.schema.StatusBeta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

@Configuration
@ComponentScan("com.demo.services.client")
public class Config {
}
