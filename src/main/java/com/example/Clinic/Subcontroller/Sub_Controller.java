package com.example.Clinic.Subcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Sub_Controller {

	@RequestMapping("/user_save")
	public ModelAndView user_save()
	{
		
		ModelAndView m1 = new ModelAndView("user_save");
		return m1;
		
	}

	
	@RequestMapping("/user_fetch")
	public ModelAndView user_fetch()
	{
		
		ModelAndView m2 = new ModelAndView("user_fetch");
		return m2;
		
	}

	@RequestMapping("/index")
	public ModelAndView user_file()
	{
		
		ModelAndView m3 = new ModelAndView("index");
		return m3;
		
	}

}
