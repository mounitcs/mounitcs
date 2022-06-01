/**
 * 
 */
package com.employe.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shanumukha manikireddy
 *
 */
@Entity
@Table(name = "employee")
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String employeName;
	private String employeId;
	private String department;

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public String getEmployeId() {
		return employeId;
	}

	public void setEmployeId(String employeId) {
		this.employeId = employeId;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
