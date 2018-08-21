package org.capstore.rest.dao;

import org.capstore.rest.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("merchDao")
public interface IMerchDao extends JpaRepository<Merchant, Integer> {

}
