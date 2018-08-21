package org.capstore.rest.dao;

import javax.transaction.Transactional;

import org.capstore.rest.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("inventoryDao")

@Transactional
public interface InventoryDao extends JpaRepository<Inventory, Integer>{
	
	@Query("select i from Inventory i where i.productName=:product")
	Inventory findOne(@Param("product") String product);
	
}
