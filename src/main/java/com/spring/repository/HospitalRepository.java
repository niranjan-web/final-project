package com.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.Entity.HospitalEntity;


public interface HospitalRepository extends JpaRepository<HospitalEntity, Integer>
{

}