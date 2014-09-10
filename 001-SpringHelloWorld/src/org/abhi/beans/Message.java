package org.abhi.beans;


public class Message {
	private String message="Hello spring";

	public Message() {
		System.out.println("Message object created");
	}
	
	public Message(String message) {
		this.message = message;
		System.out.println("Message object created argument construtor");
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
}
