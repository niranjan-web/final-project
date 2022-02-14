package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.Entity.StaffEntity;
import com.spring.service.StaffService;

@Controller
public class StaffController {
	@Autowired
	private StaffService staffService;

	@PostMapping("/homes")
	public String staff(@ModelAttribute StaffEntity staff, Model model) {
		staffService.addstaff(staff);
		model.addAttribute(staff);
		return "base/home";

	}
}
