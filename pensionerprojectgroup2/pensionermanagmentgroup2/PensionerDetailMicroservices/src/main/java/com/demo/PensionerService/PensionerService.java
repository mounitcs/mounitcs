package com.demo.PensionerService;

import java.util.List;

import com.demo.Exception.AdhaarNotFound;
import com.demo.bean.Pensioner;

public interface PensionerService {

	public Pensioner getPensionerDetailByAadharCard(String token,long aadharNumber) throws AdhaarNotFound;

	public static List<Pensioner> getAllPensioner(String requestTokenHeader) {
		// TODO Auto-generated method stub
		return null;
	}

}
