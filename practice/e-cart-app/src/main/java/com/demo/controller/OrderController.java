package com.demo.controller;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@PostMapping(value="/createorde")
Order addOrder(@RequestBody Order ord) {
		
	}
	

}
