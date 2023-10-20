package com.example.Clinic.Implementations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.Clinic.ClinicData.User__Data;
import com.example.Clinic.UserRepository.User_Repository;

@Service
public class User_Data_imple implements User_Repository {



	@Autowired
	JdbcTemplate jdbctemplte;
	
	@Autowired
	User__Data userdata;
	
	
	@Override
	public User__Data saveUser(User__Data userdata) {
		// TODO Auto-generated method stub
		
		
	String INSERT_USER_DATA ="insert into user1 values(?,?,?,?,?)";
		
		jdbctemplte.update(INSERT_USER_DATA,userdata.getName(),userdata.getEmail(),userdata.getAddress(),userdata.getDoctor(),userdata.getContact());
		return userdata;
		
	}

	

	@Override
	public List<User__Data> totalUsers() {
		// TODO Auto-generated method stub
		
		String GET_USERS_DATA ="SELECT * FROM USER1";
		
		return jdbctemplte.query(GET_USERS_DATA,new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
			User__Data userData = new User__Data();
			
			userData.setName(rs.getString("name"));
			
			userData.setEmail(rs.getString("email"));
			
			userData.setAddress(rs.getString("address"));
			
			userData.setDoctor(rs.getString("doctor"));
			
			userData.setContact(rs.getLong("contact"));
			
	
				return userData;
			}
		} );
	}

	
	

}
