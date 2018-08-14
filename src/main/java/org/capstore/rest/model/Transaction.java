package org.capstore.rest.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
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

@OneToOne(targetEntity = ReturnOrders.class, mappedBy = "transaction") 
private ReturnOrders returnOrder;

public Transaction() {
	
}

public Transaction(int transactionId, Order order, double amount, String modeOfPurchase, String status) {
	
	this.transactionId = transactionId;
	this.order = order;
	this.amount = amount;
	this.modeOfPurchase = modeOfPurchase;
	this.status = status;
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
}
 
	
	
	 
 
