package com.cts.authorization.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String userName;
	private String password;
	
	public JwtRequest()
	{
		
	}

	public JwtRequest(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
	}
}