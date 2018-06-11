package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ServiceConsumerZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerZuulApplication.class, args);
	}
}
