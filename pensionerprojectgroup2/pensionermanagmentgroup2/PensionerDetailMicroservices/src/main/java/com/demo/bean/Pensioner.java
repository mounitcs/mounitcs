package com.demo.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Pensioner {

	@Id
	@Column(name = "aadhar")
	private long aadharNumber;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dob")
	private LocalDate dateOfBirth;
	private String pan;
	@Column(name = "salary")
	private double salaryEarned;
	private double allowances;
	@Column(name =  "pension")
	private String pensionType;
	@Column(name = "bank")
	private String bankName;
	@Column(name = "accnumber")
	private String accountNumber;
	@Column(name = "banktype")
	private String bankType;
	
}

