package com.training.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		
		// container will create JDBCTemplate bean with datasource wired in it.
		ApplicationContext container = new ClassPathXmlApplicationContext("springbean.xml");
		
		System.out.println("container ready...");
		
	}
}
