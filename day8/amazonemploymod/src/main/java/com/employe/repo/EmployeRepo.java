package com.employe.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employe.bean.Employe;
@Repository
public interface EmployeRepo extends JpaRepository<Employe,Long> {

}
