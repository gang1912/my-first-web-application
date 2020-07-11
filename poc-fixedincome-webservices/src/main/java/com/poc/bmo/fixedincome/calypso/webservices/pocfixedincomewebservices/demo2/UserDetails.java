package com.poc.bmo.fixedincome.calypso.webservices.pocfixedincomewebservices.demo2;

public class UserDetails {

	private String userName;
	private String userId;
	private String domain;
	
	
	public UserDetails(String userName, String userId, String domain) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.domain = domain;
	}

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getDomain() {
		return domain;
	}


	public void setDomain(String domain) {
		this.domain = domain;
	}


	@Override
	public String toString() {
		return String.format("UserDetails [userName=%s, userId=%s, domain=%s]", userName, userId, domain);
	}
	
	
}
