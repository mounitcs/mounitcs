package com.demo.service;

import com.demo.bean.PensionerLogin;

public interface PensionerService {
	
	//post
	PensionerLogin login(String username,String userpassword);

}
