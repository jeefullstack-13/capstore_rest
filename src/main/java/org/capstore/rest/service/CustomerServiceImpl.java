package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.dao.CustomerDao;
import org.capstore.rest.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> getAllCustomerEmail() {
	
		return customerDao.findAll();
	}
	@Override
    public Customer findOne(Integer customerId){
    	return customerDao.getOne(customerId);
    }
	@Override
    public List<Customer> getAllCustomer(){
    	return (List<Customer>) customerDao.findAll();
    }

}
