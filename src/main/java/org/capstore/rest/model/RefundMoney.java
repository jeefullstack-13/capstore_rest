package org.capstore.rest.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
public class RefundMoney {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int refundId;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="returnOrderId")
private ReturnOrders returnOrder;
@OneToOne(fetch=FetchType.LAZY)
@JoinColumn(name="transactionId")
private Transaction transaction;
@OneToOne(fetch=FetchType.LAZY)
@JoinColumn(name="bankAccountId")
private BankAccount bankAccount;
public int getRefundId() {
	return refundId;
}
public void setRefundId(int refundId) {
	this.refundId = refundId;
}
public ReturnOrders getReturnOrder() {
	return returnOrder;
}
public void setReturnOrder(ReturnOrders returnOrder) {
	this.returnOrder = returnOrder;
}
public Transaction getTransaction() {
	return transaction;
}
public void setTransaction(Transaction transaction) {
	this.transaction = transaction;
}
public BankAccount getBankAccount() {
	return bankAccount;
}
public void setBankAccount(BankAccount bankAccount) {
	this.bankAccount = bankAccount;
}
public RefundMoney(int refundId, ReturnOrders returnOrder, Transaction transaction, BankAccount bankAccount) {
	super();
	this.refundId = refundId;
	this.returnOrder = returnOrder;
	this.transaction = transaction;
	this.bankAccount = bankAccount;
}
public RefundMoney() {
	super();
}



}
