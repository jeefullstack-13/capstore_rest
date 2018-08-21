package org.capstore.rest.dao;

import javax.transaction.Transactional;

import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("shippingDao")
@Transactional
public interface IShippingDao  extends JpaRepository<Shipping,Integer>{
	
}
