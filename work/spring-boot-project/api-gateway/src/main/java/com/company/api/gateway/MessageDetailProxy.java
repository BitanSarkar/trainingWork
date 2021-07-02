package com.company.api.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MESSAGE-DETAILS-SERVICE1", url = "localhost:9050")
public interface MessageDetailProxy {
	@GetMapping("/message-details")
	public String getMessageDetails();
}
