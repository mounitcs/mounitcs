package com.clientorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaorderclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaorderclientApplication.class, args);
	}

}
