package org.capstore.rest.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
public class Shipping {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int shippingId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customerId")
	private Customer customer; 
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Address")
	private Address shippingAddress;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="orderId")
	private Order order;
	
	public Shipping() {
		
	}
	public int getShippingId() {
		return shippingId;
	}
	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
		public Shipping(int shippingId, Customer customer, Address shippingAddress, Order order) {
		super();
		this.shippingId = shippingId;
		this.customer = customer;
		this.shippingAddress = shippingAddress;
		this.order = order;
		
	}

	

}
