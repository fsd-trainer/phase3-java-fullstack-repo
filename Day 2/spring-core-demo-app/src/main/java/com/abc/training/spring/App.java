package com.abc.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// MessaageService messagBEan = new MEssageService("how are you");

		System.out.println("Hello World!");
		ApplicationContext container; // reference

		// Instantiate the object of spring container
		// ClassPathXmlApplicationContext container can read only XML configuration
		container = new ClassPathXmlApplicationContext("springbean.xml");

		System.out.println("Container started");

		// get the beans from the container by its name
		// the getBean("bean-name"); method returns Object, you as a developer
		// needs to typecast it with the specific Object.
		MessageService messageService = (MessageService) container.getBean("messageBean");

		System.out.println("Message - " + messageService.getTextMsg());
		System.out.println("Sender name - " + messageService.getSenderName()); // return null

		// messageService.setTextMsg("how are you?");
		// System.out.println( "Message - " + messageService.getTextMsg()); // return
		// "how are you?"

	}
}
