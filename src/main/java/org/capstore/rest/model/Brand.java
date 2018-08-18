package org.capstore.rest.model;


import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
public class Brand {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int brandId;
private String brandName;
@OneToMany(targetEntity=Inventory.class, mappedBy="brand")
private List<Inventory> inventory;

public Brand() {
super();
}



public int getBrandId() {
return brandId;
}

public void setBrandId(int brandId) {
this.brandId = brandId;
}

public String getBrandName() {
return brandName;
}

public void setBrandName(String brandName) {
this.brandName = brandName;
}



public List<Inventory> getInventory() {
return inventory;
}



public void setInventory(List<Inventory> inventory) {
this.inventory = inventory;
}



public Brand(int brandId, String brandName, List<Inventory> inventory) {
super();
this.brandId = brandId;
this.brandName = brandName;
this.inventory = inventory;
}








}