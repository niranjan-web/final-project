package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HospitalController {

	@GetMapping("/base")
	private String base() {
		return "base/base";
	}

	@GetMapping("/home")
	private String home() {
		return "base/home";
	}

	@GetMapping("/dashboard")
	private String dashboard() {
		return "base/dashboard";
	}

	@GetMapping("/admin")
	private String admin() {
		return "admin/admin";
	}

	@GetMapping("/adminlogin")
	private String adminlogin() {
		return "admin/adminlogin";
	}

	@GetMapping("/doctorlogin")
	private String doctorlogin() {
		return "doctor/doctorlogin";
	}

	@GetMapping("/doctor")
	private String doctor() {
		return "doctor/doctor";
	}

	@GetMapping("/stafflogin")
	private String stafflogin() {
		return "staff/stafflogin";
	}

	@GetMapping("/staff")
	private String staff() {
		return "staff/staff";
	}

	@GetMapping("/patient")
	private String patient() {
		return "patient/patient";
	}

	@GetMapping("/newfile")
	private String newfile() {
		return "newfile";
	}

}
