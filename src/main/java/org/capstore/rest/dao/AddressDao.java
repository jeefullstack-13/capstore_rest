package org.capstore.rest.dao;

import javax.transaction.Transactional;

import org.capstore.rest.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("addressDao")
@Transactional
public interface AddressDao extends JpaRepository<Address, Integer>{

}
