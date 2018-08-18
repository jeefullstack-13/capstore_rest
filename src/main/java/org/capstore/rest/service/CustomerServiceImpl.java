package org.capstore.rest.service;

import java.util.List;

<<<<<<< HEAD
import org.capstore.rest.dao.ICustomerDao;
import org.capstore.rest.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private ICustomerDao customerDao;

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerDao.findAll();
	}

	
	

=======
import org.capstore.rest.dao.CustomerDao;
import org.capstore.rest.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
    private CustomerDao customerDao;

    
    
    
	@Override
    public Customer findOne(Integer customerId){
    	return customerDao.getOne(customerId);
    }
	@Override
    public List<Customer> getAllCustomer(){
    	return (List<Customer>) customerDao.findAll();
    }
    
>>>>>>> branch 'master' of https://github.com/jeefullstack-13/capstore_rest.git
}
