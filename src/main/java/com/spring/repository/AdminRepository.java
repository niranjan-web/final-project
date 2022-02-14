package com.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Entity.AdminEntity;


public interface AdminRepository extends JpaRepository<AdminEntity, Integer>
{
	public AdminEntity findByAdminLoginAndAdminPassword(String adminLogin, String adminPassword);
}