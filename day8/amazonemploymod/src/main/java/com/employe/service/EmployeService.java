package com.employe.service;

import java.util.List;

import com.employe.bean.Employe;

public interface EmployeService {

	// Adding customerDetails by admin
	Employe addEmploye(Employe employeDetails); // insert method

	// get all list of customer details
	List<Employe> getAllListofEmployees();

	// method 2 get customer by id
	// Customer getCustomerById(Customer id);

	// updating
	Employe updateEmploye(Employe employeDetails, long id); // updating exising valus in db

	// Delete
	void deleteEmployeById(long id);
}
