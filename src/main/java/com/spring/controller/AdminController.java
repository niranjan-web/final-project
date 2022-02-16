package com.spring.controller;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.Entity.AdminEntity;
import com.spring.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping("/adminLoginCheck")
	public String login(@ModelAttribute AdminEntity adminEntity) {
		AdminEntity admin = adminService.findByAdminLoginAndAdminPassword(adminEntity.getAdminLogin(),
				adminEntity.getAdminPassword());
		System.out.println(adminEntity.getAdminLogin()+ adminEntity.getAdminPassword());

		if (Objects.isNull(admin)) {
			return "/admin/adminlogin";
		} else {
			return "/admin/admin";
		}
	}
}
