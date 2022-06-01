package com.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Product;
import com.demo.repo.MyRepo;
import com.demo.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	MyRepo myrepo;
	
	@Override
	public Product addProduct(Product prod) {
		
		Product p =myrepo.save(prod);
		

		return p;
	}

}
