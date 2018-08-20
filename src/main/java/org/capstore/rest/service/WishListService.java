package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.WishList;



public interface WishListService {


	public List<WishList> getAll(int custId);
	public void save(WishList wishList);
	public WishList findById(Integer wishId);

}
