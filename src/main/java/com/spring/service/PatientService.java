package com.spring.service;

import java.util.List;

import com.spring.Entity.PatientEntity;

public interface PatientService {

	public void addpatient(PatientEntity patient);

	public List<PatientEntity> displayAllPatientList();

	public PatientEntity findByPatientId(int id);

	public void deleteByPatientId(int id);

}