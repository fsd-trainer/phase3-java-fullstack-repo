package com.abc.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageServiceDependencies {
	
	public static void main(String[] args) {
		
		// create the spring container object
		
		ApplicationContext container = new ClassPathXmlApplicationContext("springbean.xml");
		
		System.out.println("container started with the bean in it...");
		
		System.out.println("=====================================================");
		// Ask for the MessageService class object from the container
		
		MessageService1 service =    container.getBean(MessageService1.class);
		System.out.println("Text message - " + service.getTextMsg());
        System.out.println("Sendeer of message - " + service.getSenderName());
        service.printAudioVideoDetails();
		
	}

}
