package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	
	public StudentController() {
		// TODO Auto-generated constructor stub
		
	}
	@GetMapping("/")
	public String home() {
		return "srikanth";
	}

}
