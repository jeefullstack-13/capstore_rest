package org.capstore.rest.service;

import java.util.Date;
import java.util.List;

import org.capstore.rest.dao.CustomerInterface;
import org.capstore.rest.dao.EmailInterface;
import org.capstore.rest.dao.UploadImageInterface;
import org.capstore.rest.model.Attraction;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;





@Service("pilotDBService")
public class UploadingServiceImpl implements UploadingServiceInterface {
	@Autowired
	private UploadImageInterface uploadImageDBdao;
	
	@Autowired
	private CustomerInterface customerDBdao;
	
	@Autowired
	private EmailInterface emailDBdao;
	/*@Override
	public List<UploadImage> getAllImage() {
		// TODO Auto-generated method stub
		return uploadImageDBdao.findAll();
	}*/
	/**
	 * Method Name : getMaxId
	 * Return Type : int
	 * Author      : Shubhendu Mal
	 * Date        : 20 Aug,2018
	 */
	
	@Override
	public int getMaxId() {
		// TODO Auto-generated method stub
		return uploadImageDBdao.findMaxProductId();
	}
	
	
	/**
	 * Method Name : save
	 * Return Type : void
	 * Author      : Shubhendu Mal
	 * Date        : 20 Aug,2018
	 * Purpose     : To save the Attraction in Attraction Table
	 */
	
	@Override
	public void save(Attraction product) {
		// TODO Auto-generated method stub
		uploadImageDBdao.save(product);
	}
	
	/**
	 * Method Name : getAllProducts
	 * Return Type : List of Attraction
	 * Author      : Shubhendu Mal
	 * Date        : 20 Aug,2018
	 * Purpose     : To get All the Product from Attraction
	 */
	
	@Override
	public List<Attraction> getAllProducts() {
		// TODO Auto-generated method stub
		return uploadImageDBdao.findAll();
	}
	
	
	/**
	 * Method Name : getAllCustomer
	 * Return Type : List of Customer
	 * Author      : Shubhendu Mal
	 * Date        : 20 Aug,2018
	 * Purpose     : To get All the Customer 
	 */
	
	@Override
	public List<Customer> getAllCustomer(Date d) {
		// TODO Auto-generated method stub
		return customerDBdao.findByDate(d);
	}
	
	/**
	 * Method Name : findAttraction
	 * Return Type : Attraction
	 * Author      : Shubhendu Mal
	 * Date        : 20 Aug,2018
	 * Purpose     : To find the attraction with a given id 
	 */
	
	@Override
	public Attraction findAttraction(Integer id) {
		// TODO Auto-generated method stub
		return uploadImageDBdao.getOne(id);
	}
	
	/**
	 * Method Name : saveMail
	 * Return Type : void
	 * Author      : Shubhendu Mal
	 * Date        : 20 Aug,2018
	 * Purpose     : To send mail to customer 
	 */
	@Override
	public void saveMail(Email email) {
		// TODO Auto-generated method stub
		emailDBdao.save(email);
	}
	
		


}
