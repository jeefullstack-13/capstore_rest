package org.capstore.rest.dao;

import org.capstore.rest.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("adminDao")
public interface AdminDao extends JpaRepository<Admin, Integer>{

}
