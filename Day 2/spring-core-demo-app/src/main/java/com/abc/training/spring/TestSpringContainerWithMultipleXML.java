package com.abc.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContainerWithMultipleXML {

	public static void main(String[] args) {

		// if more than 1 .xml files, then add them in the String array
		String[] configfileArray = { "springbean.xml", "springbeans1.xml" };

		// Create the instance or object of spring container
		ApplicationContext container = new ClassPathXmlApplicationContext(configfileArray);

		System.out.println("spring container started with the beans in it...");

         System.out.println("================================================");
		// Ask container for the objects or spring beans
		// getBean(class) -> to ask container for the object of that type
		Audio audioObject = container.getBean(Audio.class);
		System.out.println(audioObject.audioDuration());

		// Ask for Video bean and call its business method.
		

	}

}
