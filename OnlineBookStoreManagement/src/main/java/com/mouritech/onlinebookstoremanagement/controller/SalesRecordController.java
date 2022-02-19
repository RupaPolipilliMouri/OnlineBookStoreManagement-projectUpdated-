package com.mouritech.onlinebookstoremanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinebookstoremanagement.entity.SalesRecord;
import com.mouritech.onlinebookstoremanagement.exception.SalesRecordNotFoundException;
import com.mouritech.onlinebookstoremanagement.service.CustomerService;
import com.mouritech.onlinebookstoremanagement.service.SalesRecordService;


@RestController
@RequestMapping("salesrecord/api/v1")
public class SalesRecordController {

	@Autowired
	SalesRecordService salesRecordService;
	@Autowired
	CustomerService customerService;

	@PostMapping("/salesrecord")
	public ResponseEntity<?> saveSalesRecord(@RequestBody SalesRecord newSalesRecord) {
		salesRecordService.insertSalesRecord(newSalesRecord);
		return ResponseEntity.ok().body("new salesRecord added successfully");
	}

	@GetMapping("/salesrecord")
	public ResponseEntity<List<SalesRecord>> getAllSalesRecords() {
		List<SalesRecord> salesrecordList = salesRecordService.showAllSalesRecords();
		return ResponseEntity.ok().body(salesrecordList);

	}
	@GetMapping("salesrecord/{salid}")
	public SalesRecord showSalesRecordById(@PathVariable("salid") Long salesId) throws SalesRecordNotFoundException {
		return salesRecordService.showSalesRecordById(salesId);
	}

	// update a salesRecord
	@PutMapping("salesRecord/{salid}")
	public SalesRecord updateSalesRecordById(@PathVariable("salid") Long salesId, @RequestBody SalesRecord salesRecord)
			throws SalesRecordNotFoundException {
		return salesRecordService.updateSalesRecordById(salesId, salesRecord);
	}
	@DeleteMapping("salesRecord/{salid}")
	public String deleteSalesRecordById(@PathVariable("salid") Long salesId) throws SalesRecordNotFoundException {
		salesRecordService.deleteSalesRecordById(salesId);
		return "salesRecord deleted";

	}
	
	@GetMapping("/salesrecord/{cid}")
	public ResponseEntity<List<SalesRecord>> getAllSalesRecordsByCustomerId(@PathVariable("cid") String cid) throws SalesRecordNotFoundException {
		return salesRecordService.getAllSalesRecordsByCustomerId(cid);
	}
	
}

