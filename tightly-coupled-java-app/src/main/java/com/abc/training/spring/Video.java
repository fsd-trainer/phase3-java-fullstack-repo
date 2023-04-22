package com.abc.training.spring;

public class Video {
	
	private String format;
	
	// when container creates object, it calls constructor
	public Video() {
		System.out.println("Video object created...");
	}

	// getter and setter
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		System.out.println("format property iunitialized using setter method");
		this.format = format;
	}
	
	// business method
	public String videoFormat() {
		return "Format of video - " + this.getFormat();
	}

}
