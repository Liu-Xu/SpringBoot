package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceCenterNodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCenterNodeApplication.class, args);
	}
}
