package amazonapp.service;


import java.util.List;

import amazonapp.bean.Customer;

public interface CustomerService {
   
	//Adding customerDetails by admin
	Customer addCustomer(Customer customerDetails);   //insert method
	
	//get all list of customer details
	List<Customer> getAllListofCustomers();
	
	//updating
	Customer updatecustomer(Customer customerDetails,long id); //updating exising valus in db
	
	//Delete
	void deleteCustomer(Customer customerDetails,long id);
}
