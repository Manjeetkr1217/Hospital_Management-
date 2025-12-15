package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.models.Appointment;
import com.hospital.service.AppointmentService;


@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;

	@GetMapping
	public List<Appointment> getAllAppointment(){
		System.out.println("Fetching the appointmant");
		
		return appointmentService.getAllAppointment();
	}
	
	@PostMapping
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		
		System.out.println("Creating appointment");
		
		return appointmentService.createAppointment(appointment);
	}
	
	@GetMapping("/{id}")
	public Appointment getAppointmentById(@PathVariable Long id){
		System.out.println("Fetching appointment by id");
		
		return appointmentService.getAppointmentById(id);
	}
	
	@DeleteMapping
	public void deleteAppointment(@PathVariable Long id) {
		System.out.println("Appointmentdeleted");
		appointmentService.deleteAppointment(id);
	}
	
	@PutMapping
	public void updateAppointment(@PathVariable Long id) {
		System.out.println("Appointment updated");
		appointmentService.updateAppointment(id);
	}
	
}
