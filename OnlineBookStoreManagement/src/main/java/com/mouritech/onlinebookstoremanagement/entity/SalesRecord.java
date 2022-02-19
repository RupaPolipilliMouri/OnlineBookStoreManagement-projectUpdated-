package com.mouritech.onlinebookstoremanagement.entity;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="SalesRecord")
public class SalesRecord {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="")
	private Long SalesId;
	@Column(name="CustomerId")
	private Long CustomerId;
	@Column(name="InvoiceNo")
	private int InvoiceNo;
	@Column(name="AmountToPay")
	private float AmountToPay;
	@Column(name="AmountPaid")
	private float AmountPaid;
	@Column(name="Price")
	private double Price;
	@Column(name="NoOfCopies")
	private int NoOfCopies;
	@Column(name="bookISBN")
	private String bookISBN;
	@Column(name="Balance")
	private float Balance;
	public SalesRecord() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="CustomerId",nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)

	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public float getBalance() {
		return Balance;
	}

	public void setBalance(float balance) {
		Balance = balance;
	}

	public Long getSalesId() {
		return SalesId;
	}

	public void setSalesId(Long salesId) {
		SalesId = salesId;
	}

	public Long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Long customerId) {
		CustomerId = customerId;
	}

	public int getInvoiceNo() {
		return InvoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		InvoiceNo = invoiceNo;
	}

	public float getAmountToPay() {
		return AmountToPay;
	}

	public void setAmountToPay(float amountToPay) {
		AmountToPay = amountToPay;
	}

	public float getAmountPaid() {
		return AmountPaid;
	}

	public void setAmountPaid(float amountPaid) {
		AmountPaid = amountPaid;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getNoOfCopies() {
		return NoOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		NoOfCopies = noOfCopies;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public SalesRecord(Long salesId, Long customerId, int invoiceNo, float amountToPay, float amountPaid, double price,
			int noOfCopies, String bookISBN, float balance) {
		super();
		SalesId = salesId;
		CustomerId = customerId;
		InvoiceNo = invoiceNo;
		AmountToPay = amountToPay;
		AmountPaid = amountPaid;
		Price = price;
		NoOfCopies = noOfCopies;
		this.bookISBN = bookISBN;
		Balance = balance;
		
	}

	public SalesRecord(Long customerId, int invoiceNo, float amountToPay, float amountPaid, double price, int noOfCopies,
			String bookISBN, float balance) {
		super();
		CustomerId = customerId;
		InvoiceNo = invoiceNo;
		AmountToPay = amountToPay;
		AmountPaid = amountPaid;
		Price = price;
		NoOfCopies = noOfCopies;
		this.bookISBN = bookISBN;
		Balance = balance;
	
	}

	@Override
	public String toString() {
		return "SalesRecord [SalesId=" + SalesId + ", CustomerId=" + CustomerId + ", InvoiceNo=" + InvoiceNo
				+ ", AmountToPay=" + AmountToPay + ", AmountPaid=" + AmountPaid + ", Price=" + Price + ", NoOfCopies="
				+ NoOfCopies + ", bookISBN=" + bookISBN + ", Balance=" + Balance + ", customer=" + "]";
	}

}
