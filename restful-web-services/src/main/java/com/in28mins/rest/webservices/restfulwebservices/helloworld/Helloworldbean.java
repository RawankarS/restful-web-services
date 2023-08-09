package com.in28mins.rest.webservices.restfulwebservices.helloworld;

public class Helloworldbean {

	private String message;

	public Helloworldbean(String message) {
		
		this.message=message;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "helloworldbean [message=" + message + "]";
	}

}
