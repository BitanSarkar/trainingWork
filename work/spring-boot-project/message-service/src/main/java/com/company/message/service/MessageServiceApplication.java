package com.company.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class MessageServiceApplication {

	@Autowired
	private MessageDetailsProxy proxy;
	@Value(value = "${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(MessageServiceApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Message Service Called\nRunning on port : " + port;
	}

	@GetMapping("/feign/message-details")
	public String getMessageDetails() {
		return proxy.getMessageDetails();
	}
}
