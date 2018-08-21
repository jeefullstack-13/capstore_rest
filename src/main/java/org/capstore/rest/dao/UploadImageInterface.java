package org.capstore.rest.dao;


import javax.transaction.Transactional;

import org.capstore.rest.model.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;




@Repository("uploadImageDBdao")
@Transactional
public interface UploadImageInterface extends JpaRepository<Attraction, Integer>{
	
	/**
	 * Method Name : findMaxProductId
	 * Return Type : Max product id
	 * Author      : Shubhendu Mal
	 * Date        : 20 Aug,2018
	 */
	
	
	
	@Query("select max(attractionId) from Attraction")
	public Integer findMaxProductId();
}
