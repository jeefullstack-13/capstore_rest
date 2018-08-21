package org.capstore.rest.dao;

import javax.transaction.Transactional;
import org.capstore.rest.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository("orderDao")
public interface IOrderDao extends JpaRepository<Order, Integer> {
	
}
