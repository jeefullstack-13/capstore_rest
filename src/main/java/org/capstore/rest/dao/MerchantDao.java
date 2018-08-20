package org.capstore.rest.dao;

import java.util.List;

import javax.transaction.Transactional;
import org.capstore.rest.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository("merchantDao")
@Transactional
public interface MerchantDao extends JpaRepository<Merchant, Integer>{
	
	@Query("SELECT m FROM Merchant m WHERE m.isActive='false' ORDER BY m.merchantId")
	public List<Merchant> findAllByActive();
	
}
