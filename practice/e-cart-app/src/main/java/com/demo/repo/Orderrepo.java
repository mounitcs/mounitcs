package com.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Order;

@Repository
public interface Orderrepo extends JpaRepository<Order,Long> {

}
