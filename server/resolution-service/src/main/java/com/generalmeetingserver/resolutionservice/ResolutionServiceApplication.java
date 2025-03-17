package com.generalmeetingserver.resolutionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ResolutionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResolutionServiceApplication.class, args);
	}

}
