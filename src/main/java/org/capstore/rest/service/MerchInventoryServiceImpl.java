package org.capstore.rest.service;

import java.util.List;
import javax.transaction.Transactional;

import org.capstore.rest.dao.BrandDao;
import org.capstore.rest.dao.ICategoryDao;
import org.capstore.rest.dao.IMerchDao;
import org.capstore.rest.dao.InventoryDao;
import org.capstore.rest.model.Brand;
import org.capstore.rest.model.Category;
import org.capstore.rest.model.Inventory;
import org.capstore.rest.model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("inventoryServiceMerch")
@Transactional
public class MerchInventoryServiceImpl implements MerchInventoryService {
	@Autowired
    private InventoryDao inventoryDao;
	@Autowired
	private ICategoryDao categoryDao;
	@Autowired
	private BrandDao brandDao;
	@Autowired
	private IMerchDao merchDao;
	
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
	public List<Brand> getAllBrands() {
		
		return brandDao.findAll();
	}

	@Override
	public List<Category> getAllCategories() {
		
		return categoryDao.findAll();
	}

	@Override
	public Merchant getMerch(int merchantId) {
		
		return merchDao.getOne(merchantId);
	}

	@Override
	public List<Merchant> getAllMerch() {
	
		return merchDao.findAll();
	}

	@Override
	public Inventory getProduct(String productName) {
		// TODO Auto-generated method stub
		return inventoryDao.findOne(productName);
	}

	/*@Override
	public Inventory findProduct(Integer productId) {
		// TODO Auto-generated method stub
	 inventoryDao.findProduct(productId);
	}
	*/
	
	
	
}
