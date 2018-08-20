package org.capstore.rest.service;


import java.util.List;

import org.capstore.rest.dao.AdminDao;
import org.capstore.rest.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDao adminDao;

	@Override
	public List<Admin> getAdminEmail() {
		return adminDao.findAll();
	}

	


}
