package org.capstore.rest.dao;

<<<<<<< HEAD
import org.capstore.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public interface CustomerDao  extends JpaRepository<Customer,Integer>{

}
=======
import javax.transaction.Transactional;

import org.capstore.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerDao")

@Transactional
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	

	
}

>>>>>>> branch 'master' of https://github.com/jeefullstack-13/capstore_rest.git
