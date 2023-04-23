package com.training.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	
	public static void main(String[] args) {
		
		
		// create the container
		ApplicationContext container = new ClassPathXmlApplicationContext("springbean.xml");
		
		System.out.println("Container created, beans ready in it.");
		
		System.out.println("===========================================");
		
		Person personObject =    container.getBean(Person.class);
		System.out.println(personObject.getPersonId());
		System.out.println("name - " + personObject.getPersonName());
		System.out.println("address - " + personObject.getAddress());
		
		
		
	}
}
