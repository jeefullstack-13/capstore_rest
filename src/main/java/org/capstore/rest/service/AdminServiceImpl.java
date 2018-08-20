package org.capstore.rest.service;


import java.util.List;

import org.capstore.rest.dao.AdminDao;
import org.capstore.rest.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("adminService")
<<<<<<< HEAD
public class AdminServiceImpl implements AdminService{
=======
public class AdminServiceImpl implements IAdminService{
>>>>>>> branch 'master' of https://github.com/jeefullstack-13/capstore_rest.git

	@Autowired
	private AdminDao adminDao;

	@Override
	public List<Admin> getAdminEmail() {
		
		return adminDao.findAll();
	}
<<<<<<< HEAD
=======
	
>>>>>>> branch 'master' of https://github.com/jeefullstack-13/capstore_rest.git

	

}
