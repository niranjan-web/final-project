package com.spring.serviceimplementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Entity.DoctorEntity;
import com.spring.Entity.PatientEntity;
import com.spring.repository.PatientRepository;
import com.spring.service.PatientService;


@Service
public class PatientServiceImplementation implements PatientService
{
	@Autowired
    private  PatientRepository patientRepository; 

	@Override
	public void addpatient(PatientEntity patient) {
		patientRepository.save(patient);
		
	}

	@Override
	public List<PatientEntity> displayAllPatientList() {
		return   patientRepository.findAll();
		
	}
	
	@Override
	public PatientEntity findByPatientId(int id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id).get();
	}

	@Override
	public void deleteByPatientId(int id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
	}
}