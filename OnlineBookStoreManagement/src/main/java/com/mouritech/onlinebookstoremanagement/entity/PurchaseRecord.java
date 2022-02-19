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
@Table(name="PurchaseRecord")
public class PurchaseRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="purchase_id")
    private Long PurchaseId;
	@Column(name="SupplierId")
	private Long SupplierId;
	@Column(name="PurchaseNoteNo")
    private int PurchaseNoteNo;
	@Column(name="AmountToPay")
    private float AmountToPay;
	@Column(name="AmountPaid")
    private float AmountPaid;
	@Column(name="Balance")
    private float Balance;
	@Column(name="NoOfCopies")
    private int NoOfCopies;
	@Column(name="bookISBN")
    private String bookISBN;
	
	
	public PurchaseRecord() {
		// TODO Auto-generated constructor stub
	}
//	@ManyToOne(fetch = FetchType.LAZY,optional = false)
//	@JoinColumn(name="SupplierId",nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)

//	private Supplier supplier;
//	
//
//	public Supplier getSupplier() {
//		return supplier;
//	}
//
//
//	public void setSupplier(Supplier supplier) {
//		this.supplier = supplier;
//	}


	public Long getPurchaseId() {
		return PurchaseId;
	}


	public void setPurchaseId(Long purchaseId) {
		PurchaseId = purchaseId;
	}


	public Long getSupplierId() {
		return SupplierId;
	}


	public void setSupplierId(Long supplierId) {
		SupplierId = supplierId;
	}


	public int getPurchaseNoteNo() {
		return PurchaseNoteNo;
	}


	public void setPurchaseNoteNo(int purchaseNoteNo) {
		PurchaseNoteNo = purchaseNoteNo;
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


	public float getBalance() {
		return Balance;
	}


	public void setBalance(float balance) {
		Balance = balance;
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


	public PurchaseRecord(Long purchaseId, Long supplierId, int purchaseNoteNo, float amountToPay, float amountPaid,
			float balance, int noOfCopies, String bookISBN) {
		super();
		PurchaseId = purchaseId;
		SupplierId = supplierId;
		PurchaseNoteNo = purchaseNoteNo;
		AmountToPay = amountToPay;
		AmountPaid = amountPaid;
		Balance = balance;
		NoOfCopies = noOfCopies;
		this.bookISBN = bookISBN;
	}


	public PurchaseRecord(Long supplierId, int purchaseNoteNo, float amountToPay, float amountPaid, float balance,
			int noOfCopies, String bookISBN) {
		super();
		SupplierId = supplierId;
		PurchaseNoteNo = purchaseNoteNo;
		AmountToPay = amountToPay;
		AmountPaid = amountPaid;
		Balance = balance;
		NoOfCopies = noOfCopies;
		this.bookISBN = bookISBN;
	}


	@Override
	public String toString() {
		return "PurchaseRecord [PurchaseId=" + PurchaseId + ", SupplierId=" + SupplierId + ", PurchaseNoteNo="
				+ PurchaseNoteNo + ", AmountToPay=" + AmountToPay + ", AmountPaid=" + AmountPaid + ", Balance="
				+ Balance + ", NoOfCopies=" + NoOfCopies + ", bookISBN=" + bookISBN + "]";
	}
	
	
}
