package com.example.EuricaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EuricaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuricaServiceApplication.class, args);
	}

}
