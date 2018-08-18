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
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
public class ReturnOrders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int returnId;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="orderId")
	private Order order;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="customerId")
	private Customer customer;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="transactionId")
	private Transaction transaction;
	private String description;
	private String returnMode;
	private Date returnDate;
	private Boolean merchantValidation;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="merchantId")
	private Merchant merchant;
	
	@OneToOne(targetEntity = RefundMoney.class, mappedBy = "returnOrder")
	private RefundMoney refundMoney;
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
	
	public RefundMoney getRefundMoney() {
		return refundMoney;
	}
	public void setRefundMoney(RefundMoney refundMoney) {
		this.refundMoney = refundMoney;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
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
			String returnMode, Date returnDate, Boolean merchantValidation, Merchant merchant,
			RefundMoney refundMoney) {
		super();
		this.returnId = returnId;
		this.order = order;
		this.customer = customer;
		this.transaction = transaction;
		this.description = description;
		this.returnMode = returnMode;
		this.returnDate = returnDate;
		this.merchantValidation = merchantValidation;
		this.merchant = merchant;
		this.refundMoney = refundMoney;
	}
	
	

	
	
}
