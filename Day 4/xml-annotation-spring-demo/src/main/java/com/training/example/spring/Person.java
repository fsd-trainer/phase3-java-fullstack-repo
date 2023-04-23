package com.training.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component annotation is equivalent of <bean> </bean> tag
// default name of the bean in the container will be same as class name in small-case
@Component
public class Person {

	private long personId;
	private String personName;
	
	// spring container will check for Address type, dnd if found will wire the object to this property
	// if not found, it will raise exception at runtime
	// it will write a new setter method in the code
	// public void setAddress(Address address){ this.address = address}
	@Autowired 
	private Address address; 
	

	/*public Person() {
		System.out.println("PErson object instantiated in the container");
	} */

	// @Value() annotation takes an expression
	public Person(@Value("${person.id}")long personId, @Value("${person.name}")String personName) {
		System.out.println("Parameterized constructor called and properties intialized in the object");
		this.personId = personId;
		this.personName = personName;
		System.out.println("constructor - " + this.personId + "  " + this.personName + "  " + this.address);
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override // from Object class
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}

	public Address getAddress() {
		return address;
	}
	
	
}
