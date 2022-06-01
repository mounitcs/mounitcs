package com.employe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.employe.bean.Employe;
import com.employe.service.EmployeService;

@RestController
public class EmployeController {
	@Autowired
	EmployeService employeService;

	@PostMapping(value = "/createemploye")
	Employe createEmploye(@RequestBody Employe employeDetails) {

		Employe employees = employeService.addEmploye(employeDetails);
		return employees;
	}

	// To fetch list of employes from database
	@GetMapping(value = "/viewlistofemployes")
	List<Employe> listOfcustomerdetails() {
		return employeService.getAllListofEmployees();

	}

	// update employees in database by id
	@PutMapping(value = "/updatedemployedetails/{id}")
	Employe updateEmploye(@RequestBody Employe updateemploye, @PathVariable long id) {

		Employe updateddetails = employeService.updateEmploye(updateemploye, id);
		return updateddetails;

	}

	@DeleteMapping(value = "/deleteemploye/{employeid}")
	ResponseEntity<String> deleteEmployeById(@PathVariable long employeid) {
		
	    try {
	    	if(employeid==0) {
	    		return ResponseEntity.ok("pls enter the proper id "+ employeid);
	    	}
	    	employeService.deleteEmployeById(employeid);
	    	
	    	return ResponseEntity.ok("Sucessfully Deleted"+  employeid);
	    }catch(Exception e) {
	    	return ResponseEntity.ok("Product id doesnot exists");
	    }
	}
}
