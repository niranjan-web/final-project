package com.spring.serviceimplementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Entity.DoctorEntity;
import com.spring.Entity.HospitalEntity;
import com.spring.repository.HospitalRepository;
import com.spring.service.HospitalService;


@Service
public class HospitalServiceImplementation implements HospitalService
{
	@Autowired
    private  HospitalRepository hospitalRepository; 

	@Override
	public void addhospital(HospitalEntity hospital) {
		
		hospitalRepository.save(hospital);
	}

	
	@Override
	public List<HospitalEntity> displayAllHospitalList() {
		return   hospitalRepository.findAll();
	}


	@Override
	public HospitalEntity findByPatientId(int id) {
		return hospitalRepository.findById(id).get();
	}


	@Override
	public void deleteByPatientId(int id) {
		hospitalRepository.deleteById(id);
		
	}


	@Override
	public HospitalEntity findByTokenNumber(int id) {
		return hospitalRepository.findById(id).get();
	}


	@Override
	public void deleteByTokenNumber(int id) {
		hospitalRepository.deleteById(id);
		
	}

}