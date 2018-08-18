package org.capstore.rest.service;

import java.util.List;
import org.capstore.rest.dao.MerchantDao;
import org.capstore.rest.model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MerchantServiceImpl implements MerchantService {
	@Autowired
    private MerchantDao merchantDao;
	
	@Override
	public List<Merchant> getAllMerchant() {
		// TODO Auto-generated method stub
		return (List<Merchant>) merchantDao.findAll();
	}

}
