package com.spring.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Entity.AdminEntity;
import com.spring.repository.AdminRepository;
import com.spring.service.AdminService;

@Service
public class AdminServiceImplementation implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public AdminEntity findByAdminLoginAndAdminPassword(String adminLogin, String adminPassword) {
		
		 AdminEntity adminEntity=  adminRepository.findByAdminLoginAndAdminPassword(adminLogin, 
				 adminPassword);
		return adminEntity;
	}


}
