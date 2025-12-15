package com.hospital.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hospital.models.Bill;


@Service
public class BillService {

	private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);
	
	public List<Bill> getAllBill(){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while fetching all bills: {}", e.getMessage());
			return null;
		}
		
	}
	
	
	public Bill getBillById(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while fetching bills by Id: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Bill createBill(Bill bill){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while creating bills: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Bill deleteBill(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while deleting bills: {}", e.getMessage());
			return null;
		}
		
	}
	
	public Bill updateBill(Long id){
		
		try {
			System.out.println("into service layer");
			// interact with repository layer
			return null;
		}catch(Exception e) {
			System.out.println("Error message " + e.getMessage());
			logger.error("An error occured while updating bills: {}", e.getMessage());
			return null;
		}
		
	}
}
