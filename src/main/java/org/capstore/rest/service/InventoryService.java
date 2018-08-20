package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Brand;
import org.capstore.rest.model.Category;
import org.capstore.rest.model.Inventory;

public interface InventoryService {

	public void save1(Inventory product);
	public void save(Brand br);
	public void save2(Category cg);
    public void delete(Integer productId) ;
    public List<Inventory> getAll();
	List<Inventory> getAllInventory();
	
	public List<Brand> getAllBrands();
	
	public List<Category> getAllCategories();
}
