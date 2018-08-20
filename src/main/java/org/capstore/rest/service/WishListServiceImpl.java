package org.capstore.rest.service;


import java.util.List;

import org.capstore.rest.dao.WishListDao;
import org.capstore.rest.model.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("wishListService")
public class WishListServiceImpl implements WishListService{
	
	

	
	@Autowired
	private WishListDao wishListDao;
	
	
	@Override
	public List<WishList> getAll(int custId) {
		return wishListDao.findProducts(custId);
	}


	@Override
	public void save(WishList wishList) {
		wishListDao.save(wishList);
		
	}


	@Override
	public WishList findById(Integer wishId) {
		return wishListDao.getOne(wishId);
	}

	
}

