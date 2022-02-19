package com.mouritech.onlinebookstoremanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.onlinebookstoremanagement.entity.PurchaseRecord;
import com.mouritech.onlinebookstoremanagement.exception.PurchaseRecordNotFoundException;
import com.mouritech.onlinebookstoremanagement.repository.PurchaseRecordRepository;

@Service
public class PurchaseRecordServiceImpl implements PurchaseRecordService {

	@Autowired
	PurchaseRecordRepository purchaseRecordRepository;

	public void deletePurchaseRecordById(Long purchaseId) throws PurchaseRecordNotFoundException {
		PurchaseRecord exisitingPurchaseRecord = purchaseRecordRepository.findById(purchaseId).orElseThrow(
				() -> new PurchaseRecordNotFoundException("The following record is not found with the ID"));
		purchaseRecordRepository.delete(exisitingPurchaseRecord);

	}

	public PurchaseRecord updatePurchaseRecordById(Long purchaseId, PurchaseRecord purchaseRecord)
			throws PurchaseRecordNotFoundException {
		PurchaseRecord exisitingPurchaseRecord = purchaseRecordRepository.findById(purchaseId).orElseThrow(
				() -> new PurchaseRecordNotFoundException("The following record with the id is not found"));

		exisitingPurchaseRecord.setPurchaseNoteNo(purchaseRecord.getPurchaseNoteNo());
		exisitingPurchaseRecord.setAmountPaid(purchaseRecord.getAmountPaid());
		exisitingPurchaseRecord.setAmountToPay(exisitingPurchaseRecord.getAmountPaid());
		exisitingPurchaseRecord.setBalance(exisitingPurchaseRecord.getBalance());
		exisitingPurchaseRecord.setNoOfCopies(exisitingPurchaseRecord.getNoOfCopies());
		return exisitingPurchaseRecord;
	}

	public PurchaseRecord showPurchaseRecordById(Long purchaseId) throws PurchaseRecordNotFoundException {
		return purchaseRecordRepository.findById(purchaseId).orElseThrow(
				() -> new PurchaseRecordNotFoundException("The following record is not found with the ID"));

	}

	public List<PurchaseRecord> showAllPurchaseRecords() {
		return purchaseRecordRepository.findAll();
	}

	public PurchaseRecord insertPurchaseRecord(PurchaseRecord newPurchaseRecord) {
		return purchaseRecordRepository.save(newPurchaseRecord);

	}

}
