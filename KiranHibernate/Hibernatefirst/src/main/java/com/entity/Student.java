package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int stdId;
	private String stdName;
	private String stdEmail;
	public Student() {
		
	}
	public Student(int stdId, String stdName, String stdEmail) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdEmail = stdEmail;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdEmail=" + stdEmail + "]";
	}
	
	
	
	
}
