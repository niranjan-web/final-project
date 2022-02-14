package com.spring.serviceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.Entity.DoctorEntity;
import com.spring.repository.DoctorRepository;
import com.spring.service.DoctorService;


@Service
public class DoctorServiceImplementation implements DoctorService
{
	@Autowired
    private  DoctorRepository doctorRepository; 

	@Override
	public void adddoctor(DoctorEntity doctor) {
		doctorRepository.save(doctor);
		
	}
}