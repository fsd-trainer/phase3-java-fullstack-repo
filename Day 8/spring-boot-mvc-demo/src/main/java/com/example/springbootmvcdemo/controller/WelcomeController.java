package com.example.springbootmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	
	@RequestMapping("/welcome")
	public String message() {
		
		return "test"; // name of test.jsp view page
	}
	
	
}
