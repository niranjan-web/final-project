package com.spring.serviceimplementation;
import java.util.List;

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
	
	/*
	 * @Autowired private DoctorEntity doctor;
	 */

	@Override
	public void adddoctor(DoctorEntity doctor) {
		doctorRepository.save(doctor);
		
	}

	@Override
	public DoctorEntity findByDoctorMailAndDoctorPassword(String doctorMail, String doctorPassword) {
		DoctorEntity doctorEntity=doctorRepository.findByDoctorMailAndDoctorPassword(doctorMail,doctorPassword);
		return doctorEntity;
	}

	@Override
	public List<DoctorEntity> displayAllDoctorList() {
		
		return   doctorRepository.findAll();
	}

	@Override
	public DoctorEntity findByDoctorId(int id) {
	
		return doctorRepository.findById(id).get();
		/*
		 * Optional<DoctorEntity> optional = doctorRepository.findById(id);
		 * 
		 * if(optional.isPresent()) { doctor = optional.get(); } else { throw new
		 * RuntimeException("doctor not found for id "+ id); } return doctor;
		 */
	}

	@Override
	public void deleteByDoctorId(int id) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(id);
	}

	@Override
	public void updateByDoctorId(DoctorEntity doctorEntity) {
		// TODO Auto-generated method stub

		
	}
}