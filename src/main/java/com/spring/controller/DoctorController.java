package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.Entity.DoctorEntity;
import com.spring.service.DoctorService;

@Controller
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@PostMapping("/homed")
	public String doctor(@ModelAttribute DoctorEntity doctor, Model model) {
		doctorService.adddoctor(doctor);
		model.addAttribute(doctor);
		return "base/home";

	}

}
