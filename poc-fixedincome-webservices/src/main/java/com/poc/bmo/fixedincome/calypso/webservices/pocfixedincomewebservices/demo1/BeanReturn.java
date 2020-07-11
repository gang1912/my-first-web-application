package com.poc.bmo.fixedincome.calypso.webservices.pocfixedincomewebservices.demo1;

public class BeanReturn {

	private String message;

	public BeanReturn(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("BeanReturn [message=%s]", message);
	}
	
	

}
