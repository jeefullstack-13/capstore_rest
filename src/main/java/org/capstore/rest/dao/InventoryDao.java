package org.capstore.rest.dao;

import javax.transaction.Transactional;

import org.capstore.rest.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("inventoryDao")

@Transactional
public interface InventoryDao extends JpaRepository<Inventory, Integer>{
	

	
}
