package com.training.example.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// to assign a name to bean in the container - use value attribute
//@Component(value = "addressBean")
@Component("addressBean")
public class Address {

	private String city;

	private String postalCode;

	// still constructor is called from JVM - default constructor that initialize
	// properties with default values

	// no-args constructor
	public Address() {
		System.out.println("Address object instantiated in the container");
	}

	public String getCity() {
		return city;
	}

	@Value("${address.city}") // will invoke setter method - setCity()
	public void setCity(String city) {
		System.out.println("city is initialized through setter method");
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	@Value("${address.postal}") // will invoke setter method - setPostalCode()
	public void setPostalCode(String postalCode) {
		System.out.println("PostalCOde setter method called.");
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", postalCode=" + postalCode + "]";
	}

}
