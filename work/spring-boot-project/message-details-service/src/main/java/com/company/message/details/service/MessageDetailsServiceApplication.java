package com.company.message.details.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class MessageDetailsServiceApplication {

	@Value(value = "${server.port}")
	private String port;
	
	public static void main(String[] args) {
		SpringApplication.run(MessageDetailsServiceApplication.class, args);
	}

	@GetMapping("/message-details")
	public String getMessageDetails() {
		return "Message Details Service \n Running on port : " + port;
	}

}
