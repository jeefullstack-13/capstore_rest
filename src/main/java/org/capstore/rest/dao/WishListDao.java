package org.capstore.rest.dao;

import java.util.List;

import org.capstore.rest.model.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("wishListDao")
@Transactional
public interface WishListDao extends JpaRepository<WishList, Integer>{
	
	@Query("select w.wishId, inventory.productId, w.isActive from WishList w where customer.customerId=:customerId")
	public List<WishList> findProducts(@Param("customerId")int custId);

	/*
	@Query("insert into WishList (customers.custId, inventory.productId) values(:customerId, :productId)")
	public void saveWish(@Param("customerId")Integer custId, @Param("productId")Integer prodId); */
	
	
			
}
