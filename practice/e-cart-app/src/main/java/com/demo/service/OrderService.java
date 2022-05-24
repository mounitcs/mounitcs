package com.demo.service;

import javax.persistence.criteria.Order;

public interface OrderService {
	
	abstract Order createOrder(Order order);
	

}
