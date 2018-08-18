package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Inventory;

public interface InventoryService {

	public void save(Inventory product);
    public void delete(Integer productId) ;
    public List<Inventory> getAll();
	List<Inventory> getAllInventory();
}
