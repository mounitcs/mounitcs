package com.demo.PensionerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Exception.AdhaarNotFound;
import com.demo.Exception.AuthorizationException;
import com.demo.PensionerFeign.AuthorisingClient;

import com.demo.PensionerService.PensionerService;
import com.demo.PensionerServiceImp.PensionerServiceImp;
import com.demo.bean.Pensioner;

import feign.Param;


@RestController
@RequestMapping(value = "/api/v1")
public class PensionerController {

	@Autowired
	PensionerService pensionerService;
	
	@Autowired
	private AuthorisingClient authorisingClient;
	
	@GetMapping("/PensionerDetailByAadhaar/{aadharNumber}")
	@RequestMapping(params = "Returns the Pension Details by aadharCard Number", value = "Find Pension Details By Aadhar Card number")
	public Pensioner getPensionerDetailByAadhar(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@RequestParam(name = "aadharNumber", value = "Aadhar Card Number") 
			@PathVariable long aadharNumber) throws AuthorizationException, AdhaarNotFound
	{
		if (authorisingClient.authorizeTheRequest(requestTokenHeader))
		{
			return pensionerService.getPensionerDetailByAadharCard(requestTokenHeader,aadharNumber);
		}
		
		else
		{
			throw new AuthorizationException("Not allowed");
		}
		
		
	}
	
	@GetMapping("/getAllPensioner")
	@RequestMapping(params = "Returns the Pension Details", value = "Find All Pensioner Details")
	public List<Pensioner> getAllPensioner(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader) throws AuthorizationException
	{
		if (authorisingClient.authorizeTheRequest(requestTokenHeader))
		{
			return PensionerService.getAllPensioner(requestTokenHeader);
		}
		
		else
		{
			throw new AuthorizationException("Not allowed");
		}
		
		
	}
	
}
