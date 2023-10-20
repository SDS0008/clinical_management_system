package com.example.Clinic.UserRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Clinic.ClinicData.User__Data;


@Repository
public interface User_Repository {

	 User__Data saveUser(User__Data userdata);
	 
	 List<User__Data>  totalUsers();
	}
