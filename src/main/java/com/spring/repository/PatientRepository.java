package com.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.Entity.PatientEntity;


public interface PatientRepository extends JpaRepository<PatientEntity, Integer>
{

}
