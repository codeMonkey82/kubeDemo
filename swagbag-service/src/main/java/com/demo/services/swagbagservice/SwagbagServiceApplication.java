package com.demo.services.swagbagservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SwagbagServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwagbagServiceApplication.class, args);
	}
}
