package com.example.Clinic.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Clinic.Implementations.uploadfileservice;

@RestController
public class Fileuploadcontroller {

	@Autowired
	uploadfileservice uploadfile;
	
	@RequestMapping
	public void uploadfile(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		uploadfile.uploadservice(file);
	}
	
}
