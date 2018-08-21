package org.capstore.rest.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.capstore.rest.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Transactional
@Repository("addressDao")
public interface IAddressDao extends JpaRepository<Address, Integer> {
	 @Query("select a FROM Address a WHERE a.customer.customerId=:custId")
	   	public List<Address> findAddress(@Param("custId")Integer custId);
}
