package com.demo.PensionerServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Exception.AdhaarNotFound;
import com.demo.PensionerRepository.PensionerRepository;
import com.demo.PensionerService.PensionerService;
import com.demo.bean.Pensioner;

@Service
public class PensionerServiceImp implements PensionerService{

	@Autowired
	PensionerRepository pensionerRepository;
	@Override
	public Pensioner getPensionerDetailByAadharCard(String token,long aadharNumber) throws AdhaarNotFound
	{
		 return pensionerRepository.findById(aadharNumber).orElseThrow(()-> new AdhaarNotFound("Aadhar Card Number is not Valid. Please check it and try again"));		
	}
	
	public List<Pensioner> getAllPensioner(String token)
	{
		return pensionerRepository.findAll();
	}
	
	
}
