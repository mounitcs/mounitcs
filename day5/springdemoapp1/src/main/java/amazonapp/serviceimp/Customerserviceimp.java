package amazonapp.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amazonapp.bean.Customer;
import amazonapp.repository.MyLocalRepository;
import amazonapp.service.CustomerService;


@Service
public class Customerserviceimp implements CustomerService {
	@Autowired
	MyLocalRepository myLocalRepository;

	public Customer addCustomer(Customer customer) {
		
		Customer customeradd = myLocalRepository.save(customer);
	
		return customeradd;
	
	}
}
