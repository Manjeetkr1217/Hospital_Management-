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

import com.hospital.models.Bill;
import com.hospital.service.BillService;

@RestController
@RequestMapping("api/v1/bill")
public class BillController {
	
	@Autowired
	private BillService billService;

	@GetMapping
	public List<Bill> getAllBill(){
		System.out.println("Fetching the Bill");
		
		return billService.getAllBill();
	}
	
	@PostMapping
	public Bill createBill(@RequestBody Bill bill) {
		
		System.out.println("Creating Bill");
		
		return billService.createBill(bill);
	}
	
	@GetMapping("/{id}")
	public Bill getBillById(@PathVariable Long id){
		System.out.println("Fetching bill by id");
		
		return billService.getBillById(id);
	}
	
	@DeleteMapping
	public void deleteBill(@PathVariable Long id) {
		System.out.println("bill deleted");
		billService.deleteBill(id);
	}
	
	@PutMapping
	public void updateBill(@PathVariable Long id) {
		System.out.println("Bill updated");
		billService.updateBill(id);
	}
}
