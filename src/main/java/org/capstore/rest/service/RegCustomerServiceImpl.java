package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.dao.IRegisterCustomer;
import org.capstore.rest.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("userServiceCust")
public class RegCustomerServiceImpl implements IRegCustomerService{


	@Autowired
	private IRegisterCustomer userDaoCust;
	
	@Override
	public List<Customer> getAllCustomers() {
		
		return userDaoCust.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
	
		userDaoCust.save(customer);	
	}

	@Override
	public Customer getValidCustomer(String username, String password) {
		return userDaoCust.getValidCustomer(username, password);
	}
	

}
