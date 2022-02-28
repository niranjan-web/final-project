package com.spring.controller;
import java.util.*;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.Entity.DoctorEntity;
import com.spring.Entity.StaffEntity;
import com.spring.service.StaffService;

@Controller
public class StaffController {
	@Autowired
	private StaffService staffService;
	

	@PostMapping("/homes")
	public String staff (@ModelAttribute StaffEntity staff, Model model) 
	{		 
		staffService.addstaff(staff);
		model.addAttribute(staff);
		return"base/home";
	}
	
	@PostMapping("/staffLoginCheck")
	public String login(@ModelAttribute StaffEntity staffEntity)
	 {	
		  StaffEntity staff= staffService.findByStaffMailAndStaffPassword(staffEntity.getStaffMail(),
					  staffEntity.getStaffPassword());

			  if(Objects.isNull(staff))
			  {
				      return "staff/stafflogin";
			  }
			  else
			  {
				    return   "staff/staff";   
			  }
	  }
	
	@GetMapping("/list")
	private String list(Model model) 
	{
		
		List<StaffEntity>  list =  staffService.displayAllStaffList();
		model.addAttribute("staffform", list);
		return"staff/list";
	}
	
	@GetMapping("/staffsdetail")
	private String stafflist(Model model) 
	{
		
		List<StaffEntity>  list =  staffService.displayAllStaffList();
		model.addAttribute("staffform", list);
			return"staff/staffsdetail";
	}
	
	@GetMapping("/deletestaff{id}")
	private String delete(@PathVariable int id,Model model) 
	{
		
		StaffEntity staffEntity  = staffService.findByStaffId(id);
		if(staffEntity!=null)
		{
			   staffService.deleteByStaffId(id);
			   List<StaffEntity>  list =  staffService.displayAllStaffList();
				model.addAttribute("staffform", list);
		}
		return "/staff/staffsdetail";
	}
	
	
	@GetMapping("/updateStaff{id}")
	private String update(@PathVariable int id,Model model) 
	{
		model.addAttribute("staff" ,staffService.findByStaffId(id));
		
		return"staff/updateStaff";
	}
	
	@PostMapping("/updateStaff{id}")
	public String updateDetails(@PathVariable int id,@ModelAttribute("staff") StaffEntity staff,Model model)
	{
	
		StaffEntity entityObj = staffService.findByStaffId(id); 
		if(entityObj!=null)
		{
			entityObj.setStaffId(id);
			entityObj.setStaffName(staff.getStaffName());
			entityObj.setStaffAge(staff.getStaffAge());
			entityObj.setStaffGender(staff.getStaffGender());
			entityObj.setStaffDOB(staff.getStaffDOB());
			entityObj.setStaffQualification(staff.getStaffQualification());
			entityObj.setStaffContact(staff.getStaffContact());
			entityObj.setStaffAddress(staff.getStaffAddress());
			entityObj.setStaffMail(staff.getStaffMail());
			entityObj.setStaffPassword(staff.getStaffPassword());
			entityObj.setStaffPic(staff.getStaffPic());

			
			staffService.addstaff(entityObj);
			
			return "redirect:/staffsdetail";
		
		}
		else
		{
			return "staff/staff";
		}
	
	
}
}