package org.capstore.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.capstore.rest.dao.BrandDao;
import org.capstore.rest.dao.ICategoryDao;
import org.capstore.rest.dao.InventoryDao;
import org.capstore.rest.dao.MerchantDao;
import org.capstore.rest.model.Brand;
import org.capstore.rest.model.Category;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("inventoryService")
@Transactional
public class InventoryServiceImpl implements InventoryService {
	@Autowired
    private InventoryDao inventoryDao;
	
	@Autowired
	private BrandDao brandDao;
	
	@Autowired
	private ICategoryDao categoryDao;
	
	@Override
    public List<Inventory> getAllInventory(){
    	return (List<Inventory>) inventoryDao.findAll();
    }

	@Override
	public void save1(Inventory product) {
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
	public List<Brand> getAllBrands() {
		// TODO Auto-generated method stub
		return brandDao.findAll();
	}

	@Override
	public List<Category> getAllCategories() {
		
		return categoryDao.findAll();
	}

	@Override
	public void save(Brand br) {
		brandDao.save(br);
		
	}

	@Override
	public void save2(Category cg) {
		categoryDao.save(cg);
		
	}

	/*@Override
	public Inventory findProduct(Integer productId) {
		// TODO Auto-generated method stub
	 inventoryDao.findProduct(productId);
	}
	*/
	
	
	
}
