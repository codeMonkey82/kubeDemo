package com.demo.services.swaggerproxyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableZuulProxy
@EnableSwagger2
@ComponentScan({"com.demo.services.swaggerproxyservice","com.demo.services.swaggerproxyservice.configuration"})
public class SwaggerProxyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerProxyServiceApplication.class, args);
	}

}
