package com.employe.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employe.bean.Employe;
import com.employe.repo.EmployeRepo;
import com.employe.service.EmployeService;
@Service
public class EmployeServiceImp implements EmployeService {
    
	@Autowired
	EmployeRepo employeRepo;
	@Override
	public Employe addEmploye(Employe employeDetails) {
		Employe addingEmploye=employeRepo.save(employeDetails);
		return addingEmploye;
	}

	@Override
	public List<Employe> getAllListofEmployees() {
		List <Employe> listofemployes=employeRepo.findAll();
		return listofemployes;
	}

	@Override
	public Employe updateEmploye(Employe employeDetails, long id) {
		employeDetails.setId(id);
		Employe updatedEmploye = employeRepo.save(employeDetails);
		return updatedEmploye;
	}

	@Override
	public void deleteEmployeById(long id) {
	     employeRepo.deleteById(id);
		
	}
    

}

