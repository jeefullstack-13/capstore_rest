package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Customer;


public interface IRegCustomerService {
	public void saveCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public Customer getValidCustomer(String username, String password);
	
}
