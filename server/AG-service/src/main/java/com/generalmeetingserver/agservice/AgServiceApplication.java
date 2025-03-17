package com.generalmeetingserver.agservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AgServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgServiceApplication.class, args);
	}

}
