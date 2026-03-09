package com.mapping.manytoone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Address {//many
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int addresseId;
	String city;
	String country;
	String state;
	int pincode;
	
	
	public Address() {
		
	
	}


	public Address(int addresseId, String city, String country, String state, int pincode) {
		super();
		this.addresseId = addresseId;
		this.city = city;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
	}


	public int getAddresseId() {
		return addresseId;
	}


	public void setAddresseId(int addresseId) {
		this.addresseId = addresseId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [addresseId=" + addresseId + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	
	
}
