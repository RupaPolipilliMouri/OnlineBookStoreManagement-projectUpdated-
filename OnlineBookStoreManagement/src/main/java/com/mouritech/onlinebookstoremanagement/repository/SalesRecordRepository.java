package com.mouritech.onlinebookstoremanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinebookstoremanagement.entity.Customer;
import com.mouritech.onlinebookstoremanagement.entity.SalesRecord;

@Repository
public interface SalesRecordRepository extends JpaRepository<SalesRecord, Long> 
{
	
	//Optional<SalesRecord> findBySalesId(int SalesId);
	//List<SalesRecord> findByProductName(String productId);
	//Optional <SalesRecord> updateSalesRecordById(int SalesId);
	//Optional<Product> findByProduByIdctNameAndSeller(Long sellerId,String productname);
	//List<Product> findBySeller(Long sellerId);
	

	Optional<Customer> findByCId(Long cid);

	
	
}
