package com.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.model.PatientDetails;
import com.assignment.repository.PatientRepository;
@Service
public class PatientServiceImp implements PatientService {

	@Autowired
	private PatientRepository patientRepo;
	
	@Override
	public List<PatientDetails> getAllpatients() {
		
		return  patientRepo.findAll();
	}

	@Override
	public PatientDetails getPatientByName(String name) {
		
		return patientRepo.findByName(name);
	}

	@Override
	public void saveOrUpdate(PatientDetails patientDetails) {
		patientRepo.save(patientDetails);
	}

}
