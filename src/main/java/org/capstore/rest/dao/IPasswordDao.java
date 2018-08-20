package org.capstore.rest.dao;

import org.capstore.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("passwordDao")
public interface IPasswordDao extends JpaRepository<Customer, Integer>{

}
