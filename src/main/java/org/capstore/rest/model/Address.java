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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customerId")
	private Customer customer;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="merchantId")
	private Merchant merchant;
	private int streetNumber;
	private String city;
	private String state;
	private String country;
	private int zipcode; 
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="shippingId")
	
	private Shipping shipping;
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Shipping getShipping() {
		return shipping;
	}
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	
	
	public Address() {
		
	}
	public Address(int addressId, Customer customer, Merchant merchant, int streetNumber, String city, String state,
			String country, int zipcode, Shipping shipping) {
		super();
		this.addressId = addressId;
		this.customer = customer;
		this.merchant = merchant;
		this.streetNumber = streetNumber;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.shipping = shipping;
	}
	

}
