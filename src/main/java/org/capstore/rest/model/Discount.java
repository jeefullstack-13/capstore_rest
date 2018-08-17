package org.capstore.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Discount {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int discountId;
	@OneToOne(targetEntity=Inventory.class, mappedBy="discount")
	private Inventory inventory;
	private double promoAmount;
	private int discountPercent;
	private Date issueDate;
	private Date expiryDate;
	private String promoName;
	public int getDiscountId() {
		return discountId;
	}
	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public double getPromoAmount() {
		return promoAmount;
	}
	public void setPromoAmount(double promoAmount) {
		this.promoAmount = promoAmount;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
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
	
	public String getPromoName() {
		return promoName;
	}
	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}
	
	public Discount(int discountId, Inventory inventory, double promoAmount, int discountPercent,
			Date issueDate, Date expiryDate, String promoName) {
		super();
		this.discountId = discountId;
		this.inventory = inventory;
		this.promoAmount = promoAmount;
		this.discountPercent = discountPercent;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.promoName = promoName;
	}
	public Discount() {
		
	}
	
}
