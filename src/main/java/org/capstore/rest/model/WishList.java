package org.capstore.rest.model;

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
public class WishList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wishId;
	@ManyToOne(fetch=FetchType.LAZY)	
	@JoinColumn(name="customerId")
	private Customer customer;
	@ManyToOne(fetch=FetchType.LAZY)	
	@JoinColumn(name="productId")
	private Inventory inventory;
	private boolean isActive;
	
	
	public WishList(int wishId, Customer customer, Inventory inventory, boolean isActive) {
		super();
		this.wishId = wishId;
		this.customer = customer;
		this.inventory = inventory;
		this.isActive = isActive;
	}

	public WishList() {
		
	}

 public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public int getWishId() {
		return wishId;
	}

	public void setWishId(int wishId) {
		this.wishId = wishId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
