package com.mouritech.onlinebookstoremanagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.onlinebookstoremanagement.entity.Customer;
import com.mouritech.onlinebookstoremanagement.exception.CustomerNotFoundException;
import com.mouritech.onlinebookstoremanagement.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer insertCustomer(Customer newCustomer) {
		return customerRepository.save(newCustomer);
	}

	@Override
	public Customer showCustomerById(Long CustomerId) throws CustomerNotFoundException {

		return customerRepository.findById(CustomerId)
				.orElseThrow(() -> new CustomerNotFoundException("The following customer id is not found"));

	}

	@Override
	public List<Customer> showAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer updateCustomerById(Long CustomerId, Customer customer) throws CustomerNotFoundException {
		Customer existingCustomer = customerRepository.findById(CustomerId).orElseThrow(() -> new CustomerNotFoundException("The following customer id is not found"));
		existingCustomer.setCustomerEmailId(existingCustomer.getCustomerEmailId());
		existingCustomer.setCustomerContactNumber(existingCustomer.getCustomerContactNumber());
		existingCustomer.setAddress(existingCustomer.getAddress());
		existingCustomer.setCustomerName(existingCustomer.getCustomerName());
		return existingCustomer;
	}

	@Override
	public void deleteCustomerById(Long CustomerId) throws CustomerNotFoundException {
		Customer exisitingCustomer = customerRepository.findById(CustomerId).orElseThrow(() -> new CustomerNotFoundException("The folowing customer id is not found"));
		customerRepository.delete(exisitingCustomer);

	}
//
//	@Override
//	public ResponseEntity<List<Customer>> getAllCustomersBySalesId(int SalesId) throws SalesRecordNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<Customer> createCustomer(int SalesId, Customer newCustomer)
//			throws SalesRecordNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Customer getCustomerNameBySalesId(int SalesId, String customername)
//			throws CustomerNameAlreadyExistsException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
