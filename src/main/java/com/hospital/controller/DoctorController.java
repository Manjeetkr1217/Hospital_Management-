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

import com.hospital.models.Doctor;
import com.hospital.service.DoctorService;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;

	@GetMapping
	public List<Doctor> getAllDoctor(){
		System.out.println("Doctor details");
		return doctorService.getAllDoctor();
	}
	
	@PostMapping
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		
		System.out.println("Doctor added");
		return doctorService.createDoctor(doctor);
	}
	
	@GetMapping("/{id}")
	public Doctor getDoctorByID(@PathVariable Long id){
		System.out.println("doctor fetched by id");
		 Doctor doctor = doctorService.getDoctorById(id);
		 return doctor;
	}
	
	@DeleteMapping("/{id}")
	public void deleteDoctorById(@PathVariable Long id) {
		System.out.println("Doctor deleted");
		doctorService.deleteDoctor(id);
	}
	
	@PutMapping("/{id}")
	public void updateDoctorById(@PathVariable Long id) {
		System.out.println("Doctor updated");
		doctorService.updateDoctor(id);
	}
	
	
}
