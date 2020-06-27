package com.maxwell.swagger2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping(value="/sayHello")
	public String sayHelloWorld() {
		return "HelloWorld\n";
	}
}
