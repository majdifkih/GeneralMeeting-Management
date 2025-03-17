package com.generalmeetingserver.voteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VoteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoteServiceApplication.class, args);
	}

}
