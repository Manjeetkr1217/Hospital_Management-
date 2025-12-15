package com.hospital.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hospital.models.Appointment;


@Service
public class AppointmentService {

	private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);
	
	public List<Appointment> getAllAppointment(){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while fetching all appointment: {}", e.getMessage());
			return null;
		}
		
	}
	
	
	public Appointment getAppointmentById(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while fetching appointment by Id: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Appointment createAppointment(Appointment appointment){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while creating appointment: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Appointment deleteAppointment(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while deleting appointment: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Appointment updateAppointment(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while updating appointment by Id: {}", e.getMessage());
			return null;
		}
		
	}
}
