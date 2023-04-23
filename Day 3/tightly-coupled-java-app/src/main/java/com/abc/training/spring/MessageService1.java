package com.abc.training.spring;

/* Feature story - we need to develop message system for whatsapp/ social app- text */
// Spring container to instantiate object of MessageService
// If MessageService needs Audio object and video object for its working
// It created object of Audio object and Video Object itself 
// REMEMBER : Tightly-coupled codes are not easy to test
public class MessageService1 {
	
	private String textMsg;
	private String senderName;
	private Audio audio; // variable of type Audio
	private Video video; // variable of type Video
	
	
	
	// no-args constructor
	public MessageService1() {
		System.out.println("MEssageService1 bean object created in the spring container");
	}
 // parameterized constructor
	// you should create required object in the constructor
	public MessageService1(String textMsg) {
		System.out.println("Parameterized constructor of MessageService1 called : textMsg");
	     this.textMsg = textMsg;
	 
	  // Not good coding style - tightly coupled code
	     this.audio = new Audio(60L);
	     this.video = new Video();
	     this.video.setFormat("wmv");
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
	
	// business method
	public void printAudioVideoDetails() {
	 System.out.println(this.audio.audioDuration());
	 System.out.println(this.video.videoFormat());
	}
	
	
	
}
