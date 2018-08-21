package org.capstore.rest.dao;

import javax.transaction.Transactional;

import org.capstore.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository("customerDao")
public interface ICustomerDao extends JpaRepository<Customer, Integer> {
	
}