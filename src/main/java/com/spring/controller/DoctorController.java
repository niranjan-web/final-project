package com.spring.controller;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.Entity.DoctorEntity;
import com.spring.Entity.StaffEntity;
import com.spring.service.DoctorService;

@Controller
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/homed")
	public String doctor (@ModelAttribute DoctorEntity doctor, Model model) 
	{		
		doctorService.adddoctor(doctor);
		model.addAttribute(doctor);
		return"/base/home";
		
	}
	
	@PostMapping("/doctorLoginCheck")
	public String doctorlogin(@ModelAttribute DoctorEntity doctorEntity)
	{
		DoctorEntity doctorLogin=doctorService.findByDoctorMailAndDoctorPassword
				(doctorEntity.getDoctorMail(),doctorEntity.getDoctorPassword());
		
		if(Objects.isNull(doctorLogin)) 
		{
			return"/doctor/doctorlogin";
		}
		else 
		{
			return"/doctor/doctor";
		}
		
	}
	
	@GetMapping("/doctorsdetail")
	private String doctorlist(Model model) 
	{
		
		List<DoctorEntity>  list =  doctorService.displayAllDoctorList();
		model.addAttribute("doctorform", list);
		
		
		return"doctor/doctorsdetail";
	}
	
	@GetMapping("/deletedoctor{id}")
	private String delete(@PathVariable int id, Model model) 
	{
		
		DoctorEntity doctorEntity  = doctorService.findByDoctorId(id);
		if(doctorEntity!=null)
		{
			   doctorService.deleteByDoctorId(id);
			   List<DoctorEntity>  list =  doctorService.displayAllDoctorList();
				model.addAttribute("doctorform", list);
		}
		return "doctor/doctorsdetail";
	
	}
}