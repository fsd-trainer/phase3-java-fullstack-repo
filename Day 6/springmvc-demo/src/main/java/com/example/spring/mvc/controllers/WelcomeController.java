package com.example.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	// RequestMapping allows to give a URL: http://localhost:8080/springmvc-demo/welcome
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String message() {
	 return "test"; // name of the view	
	}

   
}
