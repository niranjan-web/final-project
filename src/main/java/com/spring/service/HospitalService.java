package com.spring.service;

import java.util.List;

import com.spring.Entity.HospitalEntity;

public interface HospitalService {

	public void addhospital(HospitalEntity hospital);



	public List<HospitalEntity> displayAllHospitalList();

	

	public HospitalEntity findByPatientId(int id);



	public void deleteByPatientId(int id);



	public HospitalEntity findByTokenNumber(int id);



	public void deleteByTokenNumber(int id);

}