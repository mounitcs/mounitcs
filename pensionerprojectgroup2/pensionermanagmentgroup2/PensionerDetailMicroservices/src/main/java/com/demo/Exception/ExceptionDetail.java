package com.demo.Exception;

import java.time.LocalDateTime;

import org.apache.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExceptionDetail {

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timeStamp;
	private HttpStatus status;
	private String message;
	
	public ExceptionDetail(LocalDateTime timeStamp, HttpStatus status, String message) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.message = message;
	}
}

