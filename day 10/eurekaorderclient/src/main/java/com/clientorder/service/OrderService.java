package com.clientorder.service;

import java.util.List;

import com.clientorder.bean.Order;


public interface OrderService {
	// Adding customerDetails by admin
	Order addOrder(Order orderDetails); // insert method

	// get all list of customer details
	List<Order> getAllListofOrders();

	// method 2 get customer by id
	// Customer getCustomerById(Customer id);

	// updating
	Order updateOrder(Order orderDetails, long id); // updating exising valus in db

	// Delete
	void deleteOrderById(long id);
}
