package amazonapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import amazonapp.bean.Customer;
import amazonapp.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerservice;
	
	@PostMapping(value="/createcustomer")
	Customer addCustomer(@RequestBody Customer customerDetails) {
		
		Customer customers=customerservice.addCustomer(customerDetails);
		return customers;
	}
	
	
	//To fetch list of products from database
	@GetMapping(value="/viewlistofdetails")
	List <Customer> listOfcustomerdetails(){
		return customerservice.getAllListofCustomers();
		
	}
	
	//update customers in database
	@PutMapping(value="/updatecutomerdetails/{id}")
	Customer updatecustomer(@RequestBody Customer customerDetails,@PathVariable long id) {
		
		Customer updateddetails=customerservice.updatecustomer(customerDetails, id);
		return updateddetails;
		
	}
	@DeleteMapping(value="/deletestudent/{id}")
	public String deleteCustomer(@PathVariable long id) {
		return "Deleted";
	}
}