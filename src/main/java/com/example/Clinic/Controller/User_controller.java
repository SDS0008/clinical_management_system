package com.example.Clinic.Controller;

import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Clinic.ClinicData.User__Data;
import com.example.Clinic.UserRepository.User_Repository;


@RestController
public class User_controller {

	@Autowired
	User_Repository user_Repository;
	
	@Autowired
	User__Data userdata;

	@RequestMapping("/User_controller")
	public User__Data AddUser(@RequestParam String name,@RequestParam String email,@RequestParam String address,@RequestParam String doctor,@RequestParam Long contact) {
	
		userdata.setName(name);
		userdata.setEmail(email);
		userdata.setAddress(address);
		userdata.setDoctor(doctor);
		userdata.setContact(contact);
		

		user_Repository.saveUser(userdata);
		return userdata;
	}
	
	
	@RequestMapping("/FETCH")
	public List<User__Data> getUsers() {
	
		return user_Repository.totalUsers();
	}

}
