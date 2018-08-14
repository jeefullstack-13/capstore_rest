package org.capstore.rest.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class WishList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wishId;
	@ManyToOne(fetch=FetchType.EAGER)	
	@JoinColumn(name="customerId")
	private Customer customer;
	@OneToOne(fetch=FetchType.EAGER)	
	@JoinColumn(name="productId")
	private Inventory inventory;
	public WishList(int wishId, Customer customer) {
		super();
		this.wishId = wishId;
		this.customer = customer;
	}
	
	public WishList() {
		
	}

	public WishList(int wishId, Customer customer, Inventory inventory) {
		super();
		this.wishId = wishId;
		this.customer = customer;
		this.inventory = inventory;
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
