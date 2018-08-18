package org.capstore.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
@Table(name="captrans")
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
private int transactionId;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="orderId")
private Order order;
private double amount;
private String modeOfPurchase;
private String status;
private Date transactionDate;

@OneToOne(targetEntity = ReturnOrders.class, mappedBy = "transaction") 
private ReturnOrders returnOrder;

@OneToOne(targetEntity = GenerateInvoice.class, mappedBy = "transaction")
private GenerateInvoice generateInvoice;
@OneToOne(targetEntity = RefundMoney.class, mappedBy = "transaction")
private RefundMoney refundMoney;
public Transaction() {
	
}


public RefundMoney getRefundMoney() {
	return refundMoney;
}


public void setRefundMoney(RefundMoney refundMoney) {
	this.refundMoney = refundMoney;
}


public Date getTransactionDate() {
	return transactionDate;
}


public void setTransactionDate(Date transactionDate) {
	this.transactionDate = transactionDate;
}

public GenerateInvoice getGenerateInvoice() {
	return generateInvoice;
}

public void setGenerateInvoice(GenerateInvoice generateInvoice) {
	this.generateInvoice = generateInvoice;
}

public int getTransactionId() {
	return transactionId;
}

public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}

public Order getOrder() {
	return order;
}

public void setOrder(Order order) {
	this.order = order;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public String getModeOfPurchase() {
	return modeOfPurchase;
}

public void setModeOfPurchase(String modeOfPurchase) {
	this.modeOfPurchase = modeOfPurchase;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
public ReturnOrders getReturnOrder() {
	return returnOrder;
}

public void setReturnOrder(ReturnOrders returnOrder) {
	this.returnOrder = returnOrder;
}


public Transaction(int transactionId, Order order, double amount, String modeOfPurchase, String status,
		Date transactionDate, ReturnOrders returnOrder, GenerateInvoice generateInvoice, RefundMoney refundMoney) {
	super();
	this.transactionId = transactionId;
	this.order = order;
	this.amount = amount;
	this.modeOfPurchase = modeOfPurchase;
	this.status = status;
	this.transactionDate = transactionDate;
	this.returnOrder = returnOrder;
	this.generateInvoice = generateInvoice;
	this.refundMoney = refundMoney;
}

}
 
	
	
	 
 
