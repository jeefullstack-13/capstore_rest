package org.capstore.rest.service;

import java.util.List;
import org.capstore.rest.dao.IAddressDao;
import org.capstore.rest.dao.ICustomerDao;
import org.capstore.rest.dao.IEmailDao;
import org.capstore.rest.dao.IOrderDao;
import org.capstore.rest.dao.IShippingDao;
import org.capstore.rest.model.Address;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Email;
import org.capstore.rest.model.Order;
import org.capstore.rest.model.Shipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("shippingService")
public class ShippingServiceImpl implements IShippingService {
    @Autowired
    private IAddressDao addressDao;
	@Autowired
	private IShippingDao shippingDao;
	@Autowired
	private IEmailDao emailDao;
	@Autowired
	private ICustomerDao customerDao;
	@Autowired
	private IOrderDao orderDao;

	@Override
	public List<Address> findAll(Integer custId) {
		List<Address> address=addressDao.findAddress(custId);
		return address;
	}


	@Override
	public void addAddress(Address address) {
		addressDao.save(address);
		
	}


	@Override
	public void addShipping(Shipping shipping) {
		shippingDao.save(shipping);
		
	}


	@Override
	public List<Shipping> getShipping() {
		return shippingDao.findAll();
	}


	@Override
	public void addEmail(Email email) {
		emailDao.save(email);
		
	}


	@Override
	public List<Email> getEmail() {
		return emailDao.findAll();
		
	}


	@Override
	public Customer findCustomer(Integer custId) {
		return customerDao.getOne(custId);
	}


	@Override
	public Order findOrder(Integer orderId) {
		return orderDao.getOne(orderId);
	}
	
}
