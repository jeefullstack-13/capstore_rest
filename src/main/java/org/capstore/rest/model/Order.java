package org.capstore.rest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
@Table(name="caporder")
public class Order{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="customerId")
	private Customer customer;
	@OneToMany(targetEntity = ManagingCart.class, mappedBy = "order")
	private  List<ManagingCart> managingCart;
	@JsonFormat(pattern="dd-MMM-yyyy")
	private Date orderDate;
	@JsonFormat(pattern="dd-MMM-yyyy")
	private Date deliveredDate;
	@OneToOne(targetEntity = Shipping.class, mappedBy = "order")
	private Shipping shipping;
	private String deliveryStatus;
	@OneToOne(targetEntity = Transaction.class, mappedBy = "order")
	private Transaction transaction;
	
	@OneToOne(targetEntity = ReturnOrders.class, mappedBy = "order") 
	private ReturnOrders returnOrder;
	
	@OneToOne(targetEntity = GenerateInvoice.class, mappedBy = "order") 
	private GenerateInvoice generateInvoice;
	public ReturnOrders getReturnOrder() {
		return returnOrder;
	}
	public void setReturnOrder(ReturnOrders returnOrder) {
		this.returnOrder = returnOrder;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<ManagingCart> getManagingCart() {
		return managingCart;
	}
	public void setManagingCart(List<ManagingCart> managingCart) {
		this.managingCart = managingCart;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveredDate() {
		return deliveredDate;
	}
	public void setDeliveredDate(Date deliveredDate) {
		this.deliveredDate = deliveredDate;
	}
	public Shipping getShipping() {
		return shipping;
	}
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	public Order() {
		super();
	}
	public Order(int orderId, Customer customer, List<ManagingCart> managingCart, Date orderDate, Date deliveredDate,
			Shipping shipping, String deliveryStatus, Transaction transaction, ReturnOrders returnOrder,
			GenerateInvoice generateInvoice) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.managingCart = managingCart;
		this.orderDate = orderDate;
		this.deliveredDate = deliveredDate;
		this.shipping = shipping;
		this.deliveryStatus = deliveryStatus;
		this.transaction = transaction;
		this.returnOrder = returnOrder;
		this.generateInvoice = generateInvoice;
	}
	public GenerateInvoice getGenerateInvoice() {
		return generateInvoice;
	}
	public void setGenerateInvoice(GenerateInvoice generateInvoice) {
		this.generateInvoice = generateInvoice;
	}
	
	
	
	
	
	
	

	
	
	
}
