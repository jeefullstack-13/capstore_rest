package org.capstore.rest.dao;

import javax.transaction.Transactional;

import org.capstore.rest.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository("loginAdminDao")
@Transactional
public interface ILoginAdminDao extends JpaRepository<Admin,Integer>{
	@Query("SELECT a FROM Admin a WHERE a.email=:email AND a.password=:password")
	Admin getAdmin(@Param("email") String email, @Param("password") String password);
}
