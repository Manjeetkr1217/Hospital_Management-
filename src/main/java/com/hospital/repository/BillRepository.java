package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.models.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
