package com.example.Clinic.Implementations;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class uploadfileservice {

	public void uploadservice(MultipartFile file) throws IllegalStateException, IOException {
		
		file.transferTo(new File("C:\\Users\\SAYALA DIVYA SUMANTH\\OneDrive\\Desktop"+file.getOriginalFilename()));
	}
	
	
}
