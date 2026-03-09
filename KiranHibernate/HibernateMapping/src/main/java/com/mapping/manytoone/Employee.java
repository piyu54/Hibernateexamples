package com.mapping.manytoone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity

public class Employee {

	//one
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId;
	String empName;
	String empEmail;
	
	@ManyToOne
	Address add;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, String empEmail, Address add) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.add = add;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", add=" + add + "]";
	}
	
	
	
}
