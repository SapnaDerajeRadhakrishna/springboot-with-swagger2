package com.maxwell.apigee.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping(value="/sayHello")
	public String sayHelloWorld() {
		System.out.println("Say Hello");
		return "HelloWorld\n";
	}
}
