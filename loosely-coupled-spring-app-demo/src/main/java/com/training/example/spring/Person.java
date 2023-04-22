package com.training.example.spring;

public class Person {
	private long personId;
	private String personName;
	private Address address;

	// constructor
	// Address object will be created by the spring container and injected in the address parameter
	public Person(long personId, String personName, Address address) {
		System.out.println("Person object is created and injected with dependent object");
		this.personId = personId;
		this.personName = personName;
		this.address = address;
		
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
