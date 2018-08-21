package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Address;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Email;
import org.capstore.rest.model.Order;
import org.capstore.rest.model.Shipping;

public interface IShippingService {
	public List<Address> findAll(Integer custId);

	public void addAddress(Address address);

	public void addShipping(Shipping shipping);

	public List<Shipping> getShipping();

	public void addEmail(Email email);

	public List<Email> getEmail();

	public Customer findCustomer(Integer custId);

	public Order findOrder(Integer orderId);
	
}
