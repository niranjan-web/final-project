package com.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.Entity.DoctorEntity;
import com.spring.Entity.PatientEntity;
import com.spring.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping("/homep")
	public String next (@ModelAttribute PatientEntity patient, Model model) 
	{
		 
		patientService.addpatient(patient);
		model.addAttribute(patient);

		return"base/home";
		
	}
	@GetMapping("/patientsdetail")
	private String stafflist(Model model) 
	{
		
		List<PatientEntity>  list =  patientService.displayAllPatientList();
		model.addAttribute("patient", list);
		
		
		return"patient/patientsdetail";
	}

	@GetMapping("/deletepatient{id}")
	private String delete(@PathVariable int id, Model model) 
	{
		
		PatientEntity patientEntity  = patientService.findByPatientId(id);
		if(patientEntity!=null)
		{
				patientService.deleteByPatientId(id);
			   List<PatientEntity>  list =  patientService.displayAllPatientList();
				model.addAttribute("patient", list);
		}
		return"patient/patientsdetail";
	
	}
}