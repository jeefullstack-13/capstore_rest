package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.dao.LoginDao;
import org.capstore.rest.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	private Customer customer;
	
	public void save(Customer customer) {			
		
		loginDao.save(customer);
	}

	@Override
	public List<Customer> getAll() {
	
		return loginDao.findAll();
	}

	@Override
	public Customer findById(int id) {
              // id=1;
              // Customer cust=loginDao.getOne(id);
		//System.out.println(cust);
	return loginDao.getOne(id);
		
	}

	@Override
	public void updateCustomer(Customer cust) {
		
		loginDao.save(cust);
		
	}

	@Override
	public Customer getOne(Integer fid) {
		
		return loginDao.getOne(fid);
	}

	@Override
	public void  changePassword(int custId, String newPassword) {
         
		loginDao.updatePassword( newPassword,custId);
	}

	@Override
	public Customer getOneByEmail(String email) {
		return loginDao.getOneByEmail(email);
	}

	

}
