package com.training.example.spring.injection.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Project {

	
	private String projectName;

	public Project() {
		System.out.println("Project bean created in the container...");
	}

	public String getProjectName() {
		return projectName;
	}

	@Value("${project.name}")
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
