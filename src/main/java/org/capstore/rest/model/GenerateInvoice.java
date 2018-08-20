package org.capstore.rest.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
public class GenerateInvoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int invoiceId;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="transactionId")
	private Transaction transaction;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customerId")
	private Customer customer;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="couponId")
	private Coupons coupon;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="orderId")
	private Order order;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="invoiceProductId")
	private InvoiceProduct invoiceProduct;
	
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public GenerateInvoice() {
		super();
	}
	public Customer getCustomerId() {
		return customer;
	}
	public void setCustomerId(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Coupons getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupons coupon) {
		this.coupon = coupon;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public InvoiceProduct getInvoiceProduct() {
		return invoiceProduct;
	}
	public void setInvoiceProduct(InvoiceProduct invoiceProduct) {
		this.invoiceProduct = invoiceProduct;
	}
	public GenerateInvoice(int invoiceId, Transaction transaction, Customer customer, Coupons coupon,
			Order order, InvoiceProduct invoiceProduct) {
		super();
		this.invoiceId = invoiceId;
		this.transaction = transaction;
		this.customer = customer;
		this.coupon = coupon;
		this.order = order;
		this.invoiceProduct = invoiceProduct;
	}
	

}
