package org.capstore.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.capstore.rest.dao.InventoryDao;
import org.capstore.rest.dao.MerchantDao;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("inventoryService")
@Transactional
public class InventoryServiceImpl implements InventoryService {
	@Autowired
    private InventoryDao inventoryDao;
	
	@Override
    public List<Inventory> getAllInventory(){
    	return (List<Inventory>) inventoryDao.findAll();
    }

	@Override
	public void save(Inventory product) {
		inventoryDao.save(product);
	}
	
	@Override
	public void delete(Integer productId) {
		// TODO Auto-generated method stub
		inventoryDao.deleteById(productId);
	}

	@Override
	public List<Inventory> getAll() {
		// TODO Auto-generated method stub
		return inventoryDao.findAll();
	}

	@Override
	public Inventory findOne(Integer prodId) {
		// TODO Auto-generated method stub
		return inventoryDao.getOne(prodId);
	}

	/*@Override
	public Inventory findProduct(Integer productId) {
		// TODO Auto-generated method stub
	 inventoryDao.findProduct(productId);
	}
	*/
	
	
	
}
