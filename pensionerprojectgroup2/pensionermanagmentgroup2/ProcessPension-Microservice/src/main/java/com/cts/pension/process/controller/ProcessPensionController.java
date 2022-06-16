package com.cts.pension.process.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pension.process.exception.AadharNumberNotFound;
import com.cts.pension.process.exception.AuthorizationException;
import com.cts.pension.process.exception.PensionerDetailException;
import com.cts.pension.process.feignclient.AuthorisingClient;
import com.cts.pension.process.model.PensionDetail;
import com.cts.pension.process.model.PensionerInput;
import com.cts.pension.process.model.ProcessPensionInput;
import com.cts.pension.process.model.ProcessPensionResponse;
import com.cts.pension.process.service.ProcessPensionServiceImpl;


@RestController
@RequestMapping(value = "/api/v1")
public class ProcessPensionController {

	@Autowired
	ProcessPensionServiceImpl processPensionServiceImpl;
	
	@Autowired
	private AuthorisingClient authorisingClient;
	
	@PostMapping("/PensionDetail")
	public PensionDetail getPensionDetail(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@RequestBody PensionerInput pensionerInput) throws AuthorizationException, PensionerDetailException, AadharNumberNotFound
	{
		System.out.println("In process pension controller");
			if(authorisingClient.authorizeTheRequest(requestTokenHeader)) 
			{
				System.out.println("Hlllo+++authorization suceess");
				return processPensionServiceImpl.CalculatePension(requestTokenHeader,pensionerInput);
			}
			else
			{
				throw new AuthorizationException("Not allowed hhhhhhhhhhhhhhhhhh");
			}
	}

	
	@PostMapping("/ProcessPension")
	public ProcessPensionResponse getprocessingCode(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@RequestBody ProcessPensionInput processPensionInput) throws AuthorizationException, AadharNumberNotFound
	{
		if(authorisingClient.authorizeTheRequest(requestTokenHeader)) 
		{
			return processPensionServiceImpl.getCode(requestTokenHeader,processPensionInput);
		}
		else
		{
			throw new AuthorizationException("Not allowed");
		}
		
		
	}
	

	
}
