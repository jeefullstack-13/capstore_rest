package org.capstore.rest.dao;

import org.capstore.rest.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository("userDaoMerchant")
public interface IRegisterMerchant extends JpaRepository<Merchant,Integer>{

	@Query("SELECT m FROM Merchant m WHERE m.emailId=:email AND m.password=:password")
	Merchant getValidMerchant(@Param("email") String email, @Param("password") String password);
}
