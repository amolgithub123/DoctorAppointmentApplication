package com.assignment.service;

import java.util.List;

import com.assignment.model.PatientDetails;

public interface PatientService {

	
	public List<PatientDetails> getAllpatients();
	public PatientDetails getPatientByName(String name);
	public void saveOrUpdate(PatientDetails patientDetails);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
