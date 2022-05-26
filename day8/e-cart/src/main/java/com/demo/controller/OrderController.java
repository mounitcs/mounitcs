package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Order;
import com.demo.exception.MyCustomException;
import com.demo.service.OrderService;
import com.demo.status.Status;

@RestController
public class OrderController {

	private static final Logger log = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	OrderService OrderService;

	@PostMapping(value = "/createoreder")
	ResponseEntity<Order> addOrder(@RequestBody Order order) {
		Order addorder = null;

		try {

			log.info(" ******** in OrderController class**** " + order.getOrderamount());
			log.info(" ******** in OrderController class**** " + order.getShippingaddress());
			addorder = OrderService.createOder(order);// if it retuned null
			log.info(" ******** in after called service class**** ");

			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (MyCustomException exp) {

			exp.printStackTrace();

		}
		return new ResponseEntity<>(addorder, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
