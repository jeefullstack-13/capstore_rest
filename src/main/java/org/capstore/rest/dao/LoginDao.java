package org.capstore.rest.dao;



import javax.transaction.Transactional;

import org.capstore.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("loginDao")
@Transactional
public interface LoginDao extends JpaRepository<Customer,Integer> {

	@Query("update Customer c set c.password=:newPassword where c.customerId=:customerId")
	void updatePassword(@Param("newPassword") String newPassword,@Param("customerId") int customerId);

	@Query("SELECT c FROM Customer c WHERE c.emailId=:emailId")
	Customer getOneByEmail(@Param("emailId") String emailId);
}
