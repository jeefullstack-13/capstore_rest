package org.capstore.rest.dao;

import javax.transaction.Transactional;

import org.capstore.rest.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("emailDao")
@Transactional
public interface IEmailDao  extends JpaRepository<Email,Integer>{
	
}
