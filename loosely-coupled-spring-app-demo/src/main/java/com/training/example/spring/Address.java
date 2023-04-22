package com.training.example.spring;

public class Address {
	
	private String city;
	private String postalCode;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Address(String city, String postalCode) {
		System.out.println("Address object is created and initialized with properties");
		this.city = city;
		this.postalCode = postalCode;
	}
	
	

}
