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

import com.mouritech.onlinebookstoremanagement.entity.PurchaseRecord;
import com.mouritech.onlinebookstoremanagement.exception.PurchaseRecordNotFoundException;
import com.mouritech.onlinebookstoremanagement.service.PurchaseRecordService;

@RestController
@RequestMapping("purchaserecord/api/v1")
public class PurchaseRecordController {

	@Autowired
	PurchaseRecordService purchaseRecordService;

	@PostMapping("/purchaserecord")
	public ResponseEntity<?> savePurchaseRecord(@RequestBody PurchaseRecord newPurchaseRecord) {
		purchaseRecordService.insertPurchaseRecord(newPurchaseRecord);
		return ResponseEntity.ok().body("new purchaseRecord added successfully");
	}

	@GetMapping("/purchaserecord")
	public ResponseEntity<List<PurchaseRecord>> getAllPurchaseRecords() {
		List<PurchaseRecord> purchaserecordList = purchaseRecordService.showAllPurchaseRecords();
		return ResponseEntity.ok().body(purchaserecordList);

	}

	@GetMapping("purchaserecord/{pid}")
	public PurchaseRecord showPurchaseRecordById(@PathVariable("pid") Long purchaseId)
			throws PurchaseRecordNotFoundException {
		return purchaseRecordService.showPurchaseRecordById(purchaseId);
	}

	// update a purchaseRecord
	@PutMapping("purchaseRecord/{pid}")
	public PurchaseRecord updatePurchaseRecordById(@PathVariable("pid") Long purchaseId,
			@RequestBody PurchaseRecord purchaseRecord) throws PurchaseRecordNotFoundException {
		return purchaseRecordService.updatePurchaseRecordById(purchaseId, purchaseRecord);
	}

	@DeleteMapping("purchaseRecord/{pid}")
	public String deletePurchaseRecordById(@PathVariable("pid") Long purchaseId)
			throws PurchaseRecordNotFoundException {
		purchaseRecordService.deletePurchaseRecordById(purchaseId);
		return "purchaseRecord deleted";

	}
}
