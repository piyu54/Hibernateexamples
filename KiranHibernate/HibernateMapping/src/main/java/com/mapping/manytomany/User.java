package com.mapping.manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	
	@ManyToMany
	private List<Nominee> nomineeList = new ArrayList<Nominee>();

	public User(int id, String name, String email, List<Nominee> nomineeList) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.nomineeList = nomineeList;
	}

	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Nominee> getNomineeList() {
		return nomineeList;
	}

	public void setNomineeList(List<Nominee> nomineeList) {
		this.nomineeList = nomineeList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", nomineeList=" + nomineeList + "]";
	}
	
	
	
	
	
}
