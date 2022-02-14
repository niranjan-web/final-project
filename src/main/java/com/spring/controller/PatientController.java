package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.Entity.PatientEntity;
import com.spring.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;

	@PostMapping("/homep")
	public String next(@ModelAttribute PatientEntity patient, Model model) {

		patientService.addpatient(patient);
		model.addAttribute(patient);

		return "base/home";

	}
}
