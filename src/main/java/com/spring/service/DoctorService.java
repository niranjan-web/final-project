package com.spring.service;

import java.util.List;

import com.spring.Entity.DoctorEntity;


public interface DoctorService {
	
	public void adddoctor(DoctorEntity doctor);

	public DoctorEntity findByDoctorMailAndDoctorPassword(String doctorMail, String doctorPassword);
	
	public List<DoctorEntity> displayAllDoctorList();

	public DoctorEntity findByDoctorId(int id);

	public void deleteByDoctorId(int id);
	public void updateByDoctorId(DoctorEntity doctorEntity);
}