package com.demo.PensionerRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bean.Pensioner;

public interface PensionerRepository extends JpaRepository<Pensioner, Long>{

}
