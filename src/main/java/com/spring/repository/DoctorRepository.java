package com.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.Entity.DoctorEntity;


public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer>
{

	DoctorEntity findByDoctorMailAndDoctorPassword(String doctorMail, String doctorPassword);

}