package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Customer;

public interface CustomerService {
	Customer findOne(Integer customerId);
	List<Customer> getAllCustomer();

}
