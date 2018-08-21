package org.capstore.rest.dao;

import javax.transaction.Transactional;

import org.capstore.rest.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("emailDBdao")
@Transactional
public interface EmailInterface extends JpaRepository<Email, Integer>{

}
