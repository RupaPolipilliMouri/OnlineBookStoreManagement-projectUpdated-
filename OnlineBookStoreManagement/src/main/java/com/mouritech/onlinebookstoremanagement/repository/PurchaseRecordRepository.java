package com.mouritech.onlinebookstoremanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mouritech.onlinebookstoremanagement.entity.PurchaseRecord;

@Repository
public interface PurchaseRecordRepository extends JpaRepository<PurchaseRecord, Long> {

}
