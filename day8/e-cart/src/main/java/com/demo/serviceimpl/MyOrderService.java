package com.demo.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Order;
import com.demo.controller.OrderController;
import com.demo.exception.MyCustomException;
import com.demo.repo.MyRepo;
import com.demo.service.OrderService;

@Service
public class MyOrderService implements OrderService {
	
	 private static final Logger log = LoggerFactory.getLogger(OrderController.class);


	@Autowired
	MyRepo myRepo;

	@Override
	public Order createOder(Order order) throws MyCustomException{
		
		log.info("in service");

		Order ord = myRepo.save(order);

		return ord;
	}

}
