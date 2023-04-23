package com.training.example.spring.injection.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private String deptName;

	
	public Department(@Value("${dept.name}") String deptName) {
		System.out.println("Department bean is created in the container");
		this.deptName = deptName;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	

}
