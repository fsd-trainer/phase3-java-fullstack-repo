package com.example.springboot.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id // map the property to the primary key
	private Integer id; // for entity class, id column should be a Java class
	
	@Column(name = "name", nullable = false) // map to name column of table
	private String personName;
	
	@Column(name="email", nullable = false)
	private String email;

	@Column(name="city")
	private String city;
	
	public User() {
	  System.out.println("USer Entity object created");
	}

	public User(Integer id, String personName, String email) {
		System.out.println("user entity object created with parameterized constructor");
		this.id = id;
		this.personName = personName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", personName=" + personName + ", email=" + email + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
