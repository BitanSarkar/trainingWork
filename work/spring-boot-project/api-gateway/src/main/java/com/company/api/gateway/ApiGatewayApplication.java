package com.company.api.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
@EnableEurekaClient
public class ApiGatewayApplication {

	@Value(value = "${server.port}")
	private String port;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
		System.out.println("Running on port " + new ApiGatewayApplication().port);
	}
	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/message/**")
						.filters(f -> f.prefixPath("/message-service"))
						.uri("http://localhost:" + port))
				.route(r -> r.path("/message-details/**")
						.filters(f -> f.prefixPath("/message-detail-service"))
						.uri("http://localhost:" + port)
				).build();
	}

}
