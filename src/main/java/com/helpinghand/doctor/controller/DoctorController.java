package com.helpinghand.doctor.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	
	@GetMapping("/doctors")
	public String getDoctors()
	{
		return "i will modify doctors list later";
	}

	@GetMapping("/")
	public String getWelcom()
	{
		return "welcome";
	}
}
