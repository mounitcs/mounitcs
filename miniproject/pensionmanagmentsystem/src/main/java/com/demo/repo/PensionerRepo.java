package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bean.Pensioner;

public interface PensionerRepo extends JpaRepository<Pensioner, Long>{

}
