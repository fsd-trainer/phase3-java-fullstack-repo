package com.training.spring.boot.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// WelcomeController will send the data

@RestController
public class WelcomeController {
	
	// define the URL , / - http://localhost:8090
	// default HTTP method for request will be GET 
	@ResponseBody
	@RequestMapping(value="/")
	public String message() {
		return "Welcome to spring REST"; // plain text that will be sent to the client
	}

	
	// JSON data is sent to the client
}
