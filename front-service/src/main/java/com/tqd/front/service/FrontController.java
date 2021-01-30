package com.tqd.front.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqd.front.service.rpc.SampleClient;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class FrontController {
	
    @Autowired
    private SampleClient sc;
    
	@GetMapping("/echo")
	public String echo(String msg) {
		log.info("invoke echo");
		return "echo: "+msg;
	}
	
	@GetMapping("/greet")
	public String greet(String msg) {
		log.info("invoke greet");
		return sc.getName()+": "+msg;
	}
}
