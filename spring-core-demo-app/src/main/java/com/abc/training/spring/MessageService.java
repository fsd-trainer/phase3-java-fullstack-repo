package com.abc.training.spring;

/* Feature story - we need to develop message system for whatsapp/ social app- text */
// Spring container to instantiate object of MessageService
// If MessageService needs Audio object and video object for its working
// ?? spring - using dependency injection technique to give the dependent 
// object to the required object at the runtime.
public class MessageService {
	
	private String textMsg;
	private String senderName;
	private Audio audio ;
	private Video video ;
	
	
	// no-args constructor
	public MessageService() {
		System.out.println("MEssageService bean object created in the spring container");
	}
 // parameterized constructor
	public MessageService(String textMsg) {
		System.out.println("Parameterized constructor of MessageService called : textMsg");
	  this.textMsg = textMsg;
	  audio = new Audio(); // objects should be injected by spring container
	   video = new Video(); // objects should be injected by spring container
	}
	
	public String getTextMsg() {
		return textMsg;
	}

	public void setTextMsg(String textMsg) {
		this.textMsg = textMsg;
	}
	
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		System.out.println("Setter method for senderName property called");
		this.senderName = senderName;
	}
	public String displayMessage() {
		return this.textMsg;
	}
	
}
