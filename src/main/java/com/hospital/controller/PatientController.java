package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.models.Patient;
import com.hospital.service.PatientService;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {
	
	@Autowired
	private PatientService patientService;

	@GetMapping
	public Page<Patient> getAllPatients(@RequestParam(defaultValue = "8") int page, 
										@RequestParam(defaultValue = "0") int size){
		System.out.println("Fetching the patients");
		
		return patientService.getAllPatients(page,size);
	}
	
	@PostMapping
	public Patient createPatient(@RequestBody Patient patient) {
		
		System.out.println("Creating patient");
		
		return patientService.createPatient(patient);
	}
	
	@GetMapping("/{id}")
	public Patient getPatientById(@PathVariable Long id){
		System.out.println("Fetching patient by id");
		
		return patientService.getPatientById(id);
	}
	
	@DeleteMapping
	public void deletePatient(@PathVariable Long id) {
		System.out.println("Patient deleted");
		patientService.deletePatient(id);
	}
	
	@PutMapping
	public void updatePatient(@PathVariable Long id,Patient patient) {
		System.out.println("Patient updated");
		patientService.updatePatient(id,patient);
	}
	
}
