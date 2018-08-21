package org.capstore.rest.service;

import org.capstore.rest.dao.ILoginAdminDao;
import org.capstore.rest.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("adminLoginService")
public class AdminLoginServiceImpl implements IAdminLogin {

	@Autowired
	private ILoginAdminDao loginAdminDao;
	
	@Override
	public Admin getAdmin(String username, String password) {
		
		return loginAdminDao.getAdmin(username, password);
	}

}
