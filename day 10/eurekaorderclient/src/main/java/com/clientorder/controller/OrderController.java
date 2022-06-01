package com.clientorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clientorder.bean.Order;
import com.clientorder.service.OrderService;

@RestController
public class OrderController {
   @Autowired
   OrderService orderService;
   
   @PostMapping(value = "/createorder")
	Order createOrder(@RequestBody Order orderDetails) {

	   Order addedorders = orderService.addOrder(orderDetails);
		return addedorders;
	}

	// To fetch list of orders from database
	@GetMapping(value = "/viewlistoforders")
	List<Order> listOforderdetails() {
		return orderService.getAllListofOrders();

	}

	// update orders in database by id
	@PutMapping(value = "/updatedorderdetails/{id}")
	Order updateOrder(@RequestBody Order updateorder, @PathVariable long id) {

		Order updateddetails = orderService.updateOrder(updateorder, id);
		return updateddetails;

	}

	@DeleteMapping(value = "/deleteorder/{orderid}")
	ResponseEntity<String> deleteEmployeById(@PathVariable long orderid) {
		
	    try {
	    	if(orderid==0) {
	    		return ResponseEntity.ok("pls enter the proper id "+ orderid);
	    	}
	    	orderService.deleteOrderById(orderid);
	    	
	    	return ResponseEntity.ok("Sucessfully Deleted"+  orderid);
	    }catch(Exception e) {
	    	return ResponseEntity.ok("Product id doesnot exists");
	    }
	}
}
