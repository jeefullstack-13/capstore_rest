package org.capstore.rest.service;

import java.util.List;
import org.capstore.rest.model.Brand;
import org.capstore.rest.model.Category;
import org.capstore.rest.model.Inventory;
import org.capstore.rest.model.Merchant;


public interface MerchInventoryService {

	public void save(Inventory product);
    public void delete(Integer productId) ;
    public List<Inventory> getAll();
	List<Inventory> getAllInventory();
	public List<Brand> getAllBrands();
	public List<Category> getAllCategories();
	public Merchant getMerch(int merchantId);
	public List<Merchant> getAllMerch();
	public Inventory getProduct(String productName);
}
