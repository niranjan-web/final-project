package com.spring.controller;
import java.util.List;
import java.util.Objects;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.Entity.DoctorEntity;
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
		return"base/home";
		
	}
	
	@PostMapping("/doctorLoginCheck")
	public String doctorlogin(@ModelAttribute DoctorEntity doctorEntity)
	{
		DoctorEntity doctorLogin=doctorService.findByDoctorMailAndDoctorPassword
				(doctorEntity.getDoctorMail(),doctorEntity.getDoctorPassword());
		
		if(Objects.isNull(doctorLogin)) 
		{
			return"doctor/doctorlogin";
		}
		else 
		{
			return"doctor/doctor";
		}
		
	}
	
	@GetMapping("/listd")
	private String list(Model model) 
	{
		
		List<DoctorEntity>  list =  doctorService.displayAllDoctorList();
		model.addAttribute("doctorform", list);
		return"doctor/listd";
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
	

	
	@GetMapping("/updateDoctor{id}")
	public String update(@PathVariable int id, Model model) 
	{
		model.addAttribute("doctor", doctorService.findByDoctorId(id));
		return "doctor/updateDoctor";
		
	}
	
	
	
	@PostMapping("/updateDoctorDetail{id}")
	private String updateDoctorDetail(@PathVariable int id, 
			@ModelAttribute("doctor") DoctorEntity doctor, Model model) 
	{
		
		DoctorEntity doctorupdate  =doctorService.findByDoctorId(id);
		
		
		if(doctorupdate!=null)
		{
			doctorupdate.setDoctorId(id);
			doctorupdate.setDoctorName(doctor.getDoctorName());
			doctorupdate.setDoctorAge(doctor.getDoctorAge());
			doctorupdate.setDoctorGender(doctor.getDoctorGender());
			doctorupdate.setDoctorDOB(doctor.getDoctorDOB());
			doctorupdate.setDoctorQualification(doctor.getDoctorQualification());
			doctorupdate.setDoctorDepartment(doctor.getDoctorDepartment());
			doctorupdate.setDoctorContact(doctor.getDoctorContact());
			doctorupdate.setDoctorAddress(doctor.getDoctorAddress());
			doctorupdate.setDoctorMail(doctor.getDoctorMail());
			doctorupdate.setDoctorPassword(doctor.getDoctorPassword());
			doctorupdate.setDoctorPic(doctor.getDoctorPic());
			
			doctorService.adddoctor(doctorupdate);
			return "redirect:/doctorsdetail";
			
		}
		else
		{
			return "/doctor/doctor";
			
		}
	}
	
}