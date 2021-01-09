package com.assignment.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.model.PatientDetails;

public interface PatientRepository extends JpaRepository<PatientDetails, String> {
	
    PatientDetails findByName(String name);

}
