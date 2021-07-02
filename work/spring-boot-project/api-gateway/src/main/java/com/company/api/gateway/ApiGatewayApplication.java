package com.company.api.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
@EnableEurekaClient
public class ApiGatewayApplication {

	@Autowired
	private MessageDetailProxy proxyMessageDetail;
	@Autowired
	private MessageProxy proxyMessage;

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@GetMapping("/message-details")
	public String getMessageDetails() {
		return proxyMessageDetail.getMessageDetails();
	}

	@GetMapping("/message")
	public String getMessage() {
		return proxyMessage.getMessage();
	}

}
