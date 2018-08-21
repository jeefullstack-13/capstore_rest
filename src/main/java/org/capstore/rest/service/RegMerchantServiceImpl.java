package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.dao.IRegisterMerchant;
import org.capstore.rest.model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service("userServiceMerchant")
public class RegMerchantServiceImpl implements IRegMerchantService {
	
	@Autowired
	private IRegisterMerchant userDaoMerchant;
	
	@Override
	public void saveMerchant(Merchant merchant) {
		
		userDaoMerchant.save(merchant);	
	}

	@Override
	public List<Merchant> getAllMerchants() {
		
		return userDaoMerchant.findAll();
	}

	@Override
	public Merchant getValidMerchant(String username, String password) {
		return userDaoMerchant.getValidMerchant(username,password);
	}

}
