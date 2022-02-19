package com.mouritech.onlinebookstoremanagement.service;

import java.util.List;

import com.mouritech.onlinebookstoremanagement.entity.PurchaseRecord;
import com.mouritech.onlinebookstoremanagement.exception.PurchaseRecordNotFoundException;

public interface PurchaseRecordService {

	PurchaseRecord insertPurchaseRecord(PurchaseRecord newPurchaseRecord);

	List<PurchaseRecord> showAllPurchaseRecords();

	PurchaseRecord showPurchaseRecordById(Long purchaseId) throws PurchaseRecordNotFoundException;

	PurchaseRecord updatePurchaseRecordById(Long purchaseId, PurchaseRecord purchaseRecord) throws PurchaseRecordNotFoundException;

	void deletePurchaseRecordById(Long purchaseId) throws PurchaseRecordNotFoundException;

	

}
