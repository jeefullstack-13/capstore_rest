package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.dao.AddressDao;
import org.capstore.rest.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("addressService")
public class AddressServiceImpl implements IAddressService {

	@Autowired
	private AddressDao addressDao;

	@Override
	public List<Address> getAllAddress() {
		return addressDao.findAll();
	}
	
	
}
