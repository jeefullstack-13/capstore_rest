package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.dao.IPasswordDao;
import org.capstore.rest.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("passwordService")
public class PasswordServiceImpl implements IPasswordService {

	@Autowired 
	private IPasswordDao passwordDao;
	
	@Override
	public List<Customer> getAllCustomers() {
	  return passwordDao.findAll();	
	}

}
