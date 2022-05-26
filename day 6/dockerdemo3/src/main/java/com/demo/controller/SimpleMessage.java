package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleMessage {
	@GetMapping(value="/showmessage")
	String Message() {
	return "Demo of docker";
	}

}
