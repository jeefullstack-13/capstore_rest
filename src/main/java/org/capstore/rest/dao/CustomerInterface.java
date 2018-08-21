package org.capstore.rest.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.capstore.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository("customerDBdao")
@Transactional
public interface CustomerInterface extends JpaRepository<Customer,Integer>{
	/**
	 * Method Name : findByDate
	 * Return Type : List Of Customer
	 * Parameter   : date
	 * Author      : Shubhendu Mal
	 * Date        : 20 Aug,2018
	 */
	
	@Query("select c from Customer c where c.lastLogin > ?1")
	public List<Customer> findByDate(Date date);
}
