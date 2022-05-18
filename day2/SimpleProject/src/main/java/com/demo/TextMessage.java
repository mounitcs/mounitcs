package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextMessage {

	@GetMapping(value="/show")
	String Message () {
		return "hi this is mouni";
	}
}
