package com.training.example.spring.injection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	
	private long employeeId;
	private String employeName;
	private Department department;
	private Project project;
	
	// constructor injection
	public Employee(@Value("${employee.id}")long employeeId, @Value("${employee.name}") String employeName, @Autowired Department department, @Autowired Project project) {
		System.out.println("Employee object created and wired with dependencies in the container..");
		this.employeeId = employeeId;
		this.employeName = employeName;
		this.department = department;
		this.project = project;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public Department getDepartment() {
		return department;
	}

	public Project getProject() {
		return project;
	}
	
	
}
