package com.clientorder.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clientorder.bean.Order;
import com.clientorder.repo.OrderRepo;
import com.clientorder.service.OrderService;

@Service
public class OrderServiceImp implements OrderService {
    
	@Autowired
	OrderRepo orderRepo;
	@Override
	public Order addOrder(Order orderDetails) {
		Order addedOrder=orderRepo.save(orderDetails);
		return addedOrder;
	}

	@Override
	public List<Order> getAllListofOrders() {
		List<Order> listOfOrders=orderRepo.findAll();
		return listOfOrders;
	}

	@Override
	public Order updateOrder(Order orderDetails, long id) {
		orderDetails.setId(id);
		Order updateord=orderRepo.save(orderDetails);
		return updateord;
	}

	@Override
	public void deleteOrderById(long id) {
		orderRepo.deleteById(id);
		
	}

}
