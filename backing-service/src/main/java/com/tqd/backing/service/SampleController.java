package com.tqd.backing.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/sample")
@Slf4j
public class SampleController {

	@GetMapping("/name")
	public String getName() {
		Faker faker=new Faker();
		log.info("invoke getName");
		return faker.name().fullName();
	}
}
