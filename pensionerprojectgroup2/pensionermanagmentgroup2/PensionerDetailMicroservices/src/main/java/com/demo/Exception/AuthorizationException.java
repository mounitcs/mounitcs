package com.demo.Exception;

@SuppressWarnings("serial")
public class AuthorizationException extends Exception{

	public AuthorizationException(String message) {
		super(message);
	}
}
