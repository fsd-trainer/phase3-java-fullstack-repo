package com.abc.training.spring;

public class Audio {

	private long length;

	// no-args constructor
	public Audio() {
		System.out.println("Audio object is instantiated in the spring container");
	}

	public Audio(long length) {
		System.out.println("Audio bean object created and length property initialized");
		this.length = length;

	}
	
	// business method - a method with some logic
	 public String audioDuration() {
		 return "Length of audio played-" + this.length + " mins";
	 }
	
}
