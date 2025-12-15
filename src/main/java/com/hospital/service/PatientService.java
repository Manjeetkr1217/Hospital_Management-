package com.hospital.service;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hospital.models.Patient;
import com.hospital.repository.PatientRepository;

@Service
public class PatientService {

	private static final Logger logger = LoggerFactory.getLogger(PatientService.class);
	
	@Autowired
	private PatientRepository patientRepository;
	
	public Page<Patient> getAllPatients(int page , int size){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			Pageable pageable = PageRequest.of(page,size);
			return patientRepository.findAll(pageable);
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while fetching all patients: {}", e.getMessage());
			return null;
		}
		
	}
	
	
	public Patient getPatientById(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			Optional<Patient> patient =  patientRepository.findById(id);
			return patient.orElse(null);
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while fetching patient by Id: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Patient createPatient(Patient patient){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return patientRepository.save(patient);
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while creatng patients: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Patient deletePatient(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			logger.error("Deleting the patient with id");
			 patientRepository.deleteById(id);
			 return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while deleting patient by Id: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Patient updatePatient(Long id, Patient updatedPatient){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			Optional<Patient> existingPatient = patientRepository.findById(id);
			if(existingPatient.isPresent()) {
				Patient p = existingPatient.get();
				p.setName(updatedPatient.getName());
				p.setAge(updatedPatient.getAge());
				p.setGender(updatedPatient.getGender());
				patientRepository.save(p);
			
				return updatedPatient;
			}else {
				logger.error("Patient with ID {} not found", id);
				return null;
			}		
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while updating patient with Id: {}", e.getMessage());
			return null;
		}
		
	}
}
