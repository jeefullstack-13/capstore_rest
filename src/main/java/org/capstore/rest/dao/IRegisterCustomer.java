package org.capstore.rest.dao;

import org.capstore.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("userDaoCust")
public interface IRegisterCustomer extends JpaRepository<Customer,Integer>{
	
	@Query("SELECT c FROM Customer c WHERE c.emailId=:email AND c.password=:password")
	Customer getValidCustomer(@Param("email") String email, @Param("password") String password);

}

