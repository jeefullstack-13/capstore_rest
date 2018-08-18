package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.dao.InventoryDao;
import org.capstore.rest.dao.MerchantDao;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {
	@Autowired
    private InventoryDao inventoryDao;
	
	@Override
    public List<Inventory> getAllInventory(){
    	return (List<Inventory>) inventoryDao.findAll();
    }
}
