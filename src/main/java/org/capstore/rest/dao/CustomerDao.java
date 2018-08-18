package org.capstore.rest.dao;

import javax.transaction.Transactional;

import org.capstore.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerDao")

@Transactional
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	

	
}

