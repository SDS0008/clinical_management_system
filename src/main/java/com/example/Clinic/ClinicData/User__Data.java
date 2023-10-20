package com.example.Clinic.ClinicData;

import org.springframework.stereotype.Component;
 

@Component
public class User__Data {


	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	private String name;
	private String email;
	private String address;
	private String doctor;
	
	private Long contact;
	
	
	
}
