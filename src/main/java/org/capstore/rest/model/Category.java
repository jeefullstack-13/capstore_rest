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
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int categoryId;
private String categoryName;

public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}

public Category(int categoryId, String categoryName, Discount discount) {
	super();
	this.categoryId = categoryId;
	this.categoryName = categoryName;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public Category() {
	super();
}

}
