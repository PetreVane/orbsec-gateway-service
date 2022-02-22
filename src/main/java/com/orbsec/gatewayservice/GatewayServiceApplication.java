package com.orbsec.gatewayservice;

import com.orbsec.gatewayservice.exceptions.GlobalExceptionConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

	@Bean
	GlobalExceptionConfiguration globalExceptionConfiguration() {
		return new GlobalExceptionConfiguration();
	}

}
