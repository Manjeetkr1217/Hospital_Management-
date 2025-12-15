package com.hospital.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hospital.models.Doctor;


@Service
public class DoctorService {

	private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);
	
	public List<Doctor> getAllDoctor(){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while fetching all doctors: {}", e.getMessage());
			return null;
		}
		
	}
	
	
	public Doctor getDoctorById(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while fetching all doctors by Id: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Doctor createDoctor(Doctor doctor){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while creating doctors: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Doctor deleteDoctor(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while deleting doctor by Id: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Doctor updateDoctor(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while updating doctors by Id: {}", e.getMessage());
			return null;
		}
		
	}
}
