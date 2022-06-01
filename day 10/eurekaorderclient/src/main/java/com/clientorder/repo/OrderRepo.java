package com.clientorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clientorder.bean.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

}
