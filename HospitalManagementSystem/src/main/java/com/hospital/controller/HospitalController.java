package com.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HospitalController {
	
	@GetMapping("/")
	public String display() {
		return"index";
		
	}
	
	@GetMapping("/dash")
	public String dashBoard() {
		return"dashboard";
	}
	
	@GetMapping("/page2")
	public String dashBoard2() {
		return"page2";
	}

}
