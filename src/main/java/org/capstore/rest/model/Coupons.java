package org.capstore.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Coupons {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int couponId;
private String couponCode;
private double couponAmount;
private String couponDescription;
private Date issueDate;
private Date expiryDate;
@OneToOne(targetEntity=Inventory.class, mappedBy="coupon")
private Inventory inventory;

public int getCouponId() {
	return couponId;
}
public void setCouponId(int couponId) {
	this.couponId = couponId;
}
public String getCouponCode() {
	return couponCode;
}
public void setCouponCode(String couponCode) {
	this.couponCode = couponCode;
}
public double getCouponAmount() {
	return couponAmount;
}
public void setCouponAmount(double couponAmount) {
	this.couponAmount = couponAmount;
}
public String getCouponDescription() {
	return couponDescription;
}
public void setCouponDescription(String couponDescription) {
	this.couponDescription = couponDescription;
}
public Date getIssueDate() {
	return issueDate;
}
public void setIssueDate(Date issueDate) {
	this.issueDate = issueDate;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
public Inventory getInventory() {
	return inventory;
}
public void setInventory(Inventory inventory) {
	this.inventory = inventory;
}
public Coupons(int couponId, String couponCode, double couponAmount, String couponDescription, Date issueDate,
		Date expiryDate, Inventory inventory) {
	super();
	this.couponId = couponId;
	this.couponCode = couponCode;
	this.couponAmount = couponAmount;
	this.couponDescription = couponDescription;
	this.issueDate = issueDate;
	this.expiryDate = expiryDate;
	this.inventory = inventory;
}
public Coupons() {
	super();
}

}
