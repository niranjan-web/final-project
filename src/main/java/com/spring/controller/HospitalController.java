package com.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.Entity.HospitalEntity;
import com.spring.service.HospitalService;

@Controller
public class HospitalController 
{
	@Autowired
	private HospitalService hospitalService;
	
			@GetMapping("/base")
			private String base() 
			{
				return"base/base";
			}
			
			@GetMapping("/index")
			private String index() 
			{
				return"base/index";
			}
			
			@GetMapping("/facility")
			private String facility() 
			{
				return"base/facility";
			}
			
			@GetMapping("/home")
			private String home() 
			{
				return"base/home";
			}
			
			@GetMapping("/dashboard")
			private String dashboard()
			{
				return"base/dashboard";
			}
			
			@GetMapping("/admin")
			private String admin()
			{
				return"admin/admin";
			}
			
			@GetMapping("/adminlogin")
			private String adminlogin() 
			{
				return"admin/adminlogin";
			}
			
			@GetMapping("/appointmentform")
			private String appoint()
			{
				return"admin/appointmentform";
			}	
			
			
			@GetMapping("/doctorlogin")
			private String doctorlogin() 
			{
				return"doctor/doctorlogin";
			}
			
			@GetMapping("/doctor")
			private String doctor() 
			{
				return"doctor/doctor";
			}
			
			@GetMapping("/doctorform")
			private String doctorform() 
			{
				return"doctor/doctorform";
			}
			
	
			
			@GetMapping("/stafflogin")
			private String stafflogin() 
			{
				return"staff/stafflogin";
			}
				
			@GetMapping("/staffform")
			private String staffform() {
				return"staff/staffform";
			}

			
			@GetMapping("/staff")
			private String staff() {
				return"staff/staff";
			}

			@GetMapping("/patient")
			private String patient()
			{
				return"patient/patient";
			}	
		
		
			@GetMapping("/newfile")
			private String newfile()
			{
				return"newfile";
			}	
			
			@PostMapping("/appoint")
			public String next (@ModelAttribute HospitalEntity hospital, Model model) 
			{
				hospitalService.addhospital(hospital);
				model.addAttribute(hospital);
				return"base/index";
				
			}
		
			@GetMapping("/appointments")
			private String appointslist(Model model) 
			{
				
				List<HospitalEntity>  list =  hospitalService.displayAllHospitalList();
				model.addAttribute("appointmentform", list);
				return"admin/appointments";
			}
			
			@GetMapping("/deleteappoints{id}")
			private String delete(@PathVariable int id, Model model) 
			{
				
				HospitalEntity hospitalEntity  = hospitalService.findByTokenNumber(id);
				if(hospitalEntity!=null)
				{
					hospitalService.deleteByTokenNumber(id);
						List<HospitalEntity>  list =  hospitalService.displayAllHospitalList();
						model.addAttribute("appointmentform", list);
				}
				return "admin/appointments";
			}
}