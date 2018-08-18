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
public class FeedBack {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int feedBackId;
	@ManyToOne(fetch=FetchType.EAGER)	
@JoinColumn(name="customerId")
private Customer customer;
	
	@ManyToOne(fetch=FetchType.EAGER)	
	@JoinColumn(name="productId")	
private Inventory inventory;
	@ManyToOne(fetch=FetchType.EAGER)	
	@JoinColumn(name="merchantId")	
	
	private Merchant merchant;
private int ProductRating;
private String comments;
private String status;




public FeedBack()
{
	
}




public FeedBack(int feedBackId, Customer customer, Inventory inventory, Merchant merchant, int productRating,
		String comments, String status) {
	super();
	this.feedBackId = feedBackId;
	this.customer = customer;
	this.inventory = inventory;
	this.merchant = merchant;
	ProductRating = productRating;
	this.comments = comments;
	this.status = status;
}




public int getFeedBackId() {
	return feedBackId;
}




public void setFeedBackId(int feedBackId) {
	this.feedBackId = feedBackId;
}




public Customer getCustomer() {
	return customer;
}




public void setCustomer(Customer customer) {
	this.customer = customer;
}




public Inventory getInventory() {
	return inventory;
}




public void setInventory(Inventory inventory) {
	this.inventory = inventory;
}




public Merchant getMerchant() {
	return merchant;
}




public void setMerchant(Merchant merchant) {
	this.merchant = merchant;
}




public int getProductRating() {
	return ProductRating;
}




public void setProductRating(int productRating) {
	ProductRating = productRating;
}




public String getComments() {
	return comments;
}




public void setComments(String comments) {
	this.comments = comments;
}




public String getStatus() {
	return status;
}




public void setStatus(String status) {
	this.status = status;
}


}
