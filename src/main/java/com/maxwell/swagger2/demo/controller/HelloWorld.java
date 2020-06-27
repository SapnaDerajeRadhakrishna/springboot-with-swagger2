package com.maxwell.swagger2.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	Logger logger = LoggerFactory.getLogger(HelloWorld.class);

	@GetMapping(value="/sayHello")
	public String sayHelloWorld() {
		logger.debug("Invoking Hello World");
		return "HelloWorld\n";
	}
}
