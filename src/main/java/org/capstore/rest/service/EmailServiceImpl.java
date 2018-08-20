package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.dao.EmailDao;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailServiceImpl implements IEmailService{

	@Autowired
	private EmailDao emailDao;
	
	@Override
	public List<Email> getAll() {
		
		return emailDao.findAll();
	}

	@Override
	public void save(Email email) {
		
		emailDao.save(email);
		
	}

}
