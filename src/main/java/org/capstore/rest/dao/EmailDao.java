package org.capstore.rest.dao;


import org.capstore.rest.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("emailDao")
public interface EmailDao extends JpaRepository<Email,Integer> {



}
