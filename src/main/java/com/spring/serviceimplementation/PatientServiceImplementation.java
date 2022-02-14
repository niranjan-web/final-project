package com.spring.serviceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}