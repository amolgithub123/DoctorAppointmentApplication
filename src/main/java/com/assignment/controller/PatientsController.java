package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.model.PatientDetails;
import com.assignment.service.PatientService;

@Controller
@RequestMapping("patient")
public class PatientsController {

	@Autowired
	private PatientService patientService;
   
    
    @RequestMapping(value="/list",  method=RequestMethod.GET )
    public ModelAndView list() {
    ModelAndView model = new ModelAndView("patient_list");	
    	
    List<PatientDetails> patientList= patientService.getAllpatients();
    	model.addObject("patientList", patientList);
    	return model;
    }
    
    @RequestMapping(value="/addPatient/", method=RequestMethod.GET)
    public ModelAndView addPatient() {
     ModelAndView model = new ModelAndView();
     
     PatientDetails patient = new PatientDetails();
     model.addObject("patientForm", patient);
     model.setViewName("patient_form");
     return model;
    
    }
    
    @RequestMapping(value="/updatePatient/{name}", method=RequestMethod.GET)
    public ModelAndView editPatient(@PathVariable String name) {
     ModelAndView model = new ModelAndView();
     
     PatientDetails patient = patientService.getPatientByName(name);
     model.addObject("patientForm", patient);
     model.setViewName("patient_form");
     return model;
    
    }
    
    @RequestMapping(value="/savePatient", method=RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("patientForm") PatientDetails patientDetails) {
        patientService.saveOrUpdate(patientDetails);
     return new ModelAndView("redirect:/patient/list");
    }
	
}
