package com.supcon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BapMicroEurekaFoundationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BapMicroEurekaFoundationApplication.class, args);
	}
}
