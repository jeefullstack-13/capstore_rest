package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Customer;

public interface ICustomerService {

	public List<Customer> getAllCustomers();

	Customer findOne(Integer customerId);

	List<Customer> getAllCustomer();

}
