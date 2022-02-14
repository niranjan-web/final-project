package com.spring.service;

import com.spring.Entity.AdminEntity;

public interface AdminService 
{
     public AdminEntity  findByAdminLoginAndAdminPassword(String adminLogin, String adminPassword);
	
}
