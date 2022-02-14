package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.Entity.StaffEntity;


public interface StaffRepository extends JpaRepository<StaffEntity, Integer>
{

}
