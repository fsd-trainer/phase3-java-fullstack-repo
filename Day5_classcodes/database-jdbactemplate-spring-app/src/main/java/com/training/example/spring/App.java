package com.training.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext container = new ClassPathXmlApplicationContext("springbean.xml");

		System.out.println("Container is ready");
		System.out.println("====================================================================");

		Student student1 = new Student();
		student1.setId(4);
		student1.setName("Abhi Drew");
		student1.setMobile(67676767L);
		student1.setCountry("India");
		StudentDAO dao = container.getBean(StudentDAO.class);
		dao.saveStudent(student1);
		
		System.out.println("Check in the database for new record to be added...");
	}
}
