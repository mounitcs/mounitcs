package com.demo.service;

import com.demo.bean.Pensioner;

public interface PensionerService {
	
	
	//GET PensionerDetails service
	 Pensioner getPensionerDetailsByAaddhar(long aadharcardid);
	 
	 //GET procession service
	 Pensioner processPension(Pensioner Pensioner);
	 
	 //POST login service
	 Pensioner longPension(String username,String password);
	 
	 //POST 
	Integer pensionerCalculator(double basicsalary,double dearnessallowance,int workedageinorganization);

}
