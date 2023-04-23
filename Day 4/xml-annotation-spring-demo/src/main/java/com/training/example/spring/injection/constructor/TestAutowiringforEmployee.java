package com.training.example.spring.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.example.spring.Person;

public class TestAutowiringforEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Create the spring container
		ApplicationContext container = new ClassPathXmlApplicationContext("springbean.xml");
		
		System.out.println("Spring container is ready with beans and their dependencies");
		
		System.out.println("===================================================================");
		
		
		// ask for employee bean from the container
		
		Employee employee = container.getBean(Employee.class);
		System.out.println(employee.getEmployeeId());
		System.out.println("name - " + employee.getEmployeName());
		System.out.println("department - " + employee.getDepartment().getDeptName());
		System.out.println("project assigned - " + employee.getProject().getProjectName());

	}

}
