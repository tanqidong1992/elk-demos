package com.tqd.front.service.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "backing-service",path = "/sample")
public interface SampleClient {
	@GetMapping("/name")
	public String getName();
}
