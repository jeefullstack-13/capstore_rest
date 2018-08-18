package org.capstore.rest.dao;

import javax.transaction.Transactional;
import org.capstore.rest.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("merchantDao")

@Transactional
public interface MerchantDao extends JpaRepository<Merchant, Integer>{
	

	
}
