package org.capstore.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class ReturnOrders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int returnId;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="orderId")
	private Order order;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customerId")
	private Customer customer;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="transactionId")
	private Transaction transaction;
	private String description;
	private String returnMode;
	private Date returnDate;
	private Boolean merchantValidation;
	
	
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getReturnId() {
		return returnId;
	}
	public void setReturnId(int returnId) {
		this.returnId = returnId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getReturnMode() {
		return returnMode;
	}
	public void setReturnMode(String returnMode) {
		this.returnMode = returnMode;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Boolean getMerchantValidation() {
		return merchantValidation;
	}
	public void setMerchantValidation(Boolean merchantValidation) {
		this.merchantValidation = merchantValidation;
	}
	public ReturnOrders() {
		super();
	}
	
	public ReturnOrders(int returnId, Order order, Customer customer, Transaction transaction, String description,
			String returnMode, Date returnDate, Boolean merchantValidation) {
		super();
		this.returnId = returnId;
		this.order = order;
		this.customer = customer;
		this.transaction = transaction;
		this.description = description;
		this.returnMode = returnMode;
		this.returnDate = returnDate;
		this.merchantValidation = merchantValidation;
	}

	
	
}
