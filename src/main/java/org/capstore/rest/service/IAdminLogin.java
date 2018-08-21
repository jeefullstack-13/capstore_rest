package org.capstore.rest.service;

import org.capstore.rest.model.Admin;

public interface IAdminLogin {

	public Admin getAdmin(String username, String password);
}
