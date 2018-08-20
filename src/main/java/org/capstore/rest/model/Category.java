package org.capstore.rest.model;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int categoryId;
private String categoryName;
@OneToOne(fetch=FetchType.LAZY)
@JoinColumn(name="discountId")
private Discount dis;
@OneToMany(targetEntity=Inventory.class, fetch=FetchType.LAZY)
private List<Inventory> inventory;
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public Discount getDis() {
	return dis;
}
public void setDis(Discount dis) {
	this.dis = dis;
}
public List<Inventory> getInventory() {
	return inventory;
}
public void setInventory(List<Inventory> inventory) {
	this.inventory = inventory;
}
public Category(int categoryId, String categoryName, Discount dis, List<Inventory> inventory) {
	super();
	this.categoryId = categoryId;
	this.categoryName = categoryName;
	this.dis = dis;
	this.inventory = inventory;
}
public Category() {
	super();
}

}
