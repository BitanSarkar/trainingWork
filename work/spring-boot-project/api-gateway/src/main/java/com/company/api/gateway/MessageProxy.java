package com.company.api.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MESSAGE-SERVICE1", url = "localhost:9090")
public interface MessageProxy {
	@GetMapping("/message")
	public String getMessage();
}
