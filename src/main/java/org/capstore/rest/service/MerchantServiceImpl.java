package org.capstore.rest.service;

import java.util.List;
import java.util.Optional;

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
		return (List<Merchant>) merchantDao.findAll();
	}

	@Override
	public  Merchant findMerchantById(Integer merchantId) {
		return merchantDao.getOne(merchantId);
	}

	@Override
	public void saveMerchant(Merchant merchant) {
		merchantDao.save(merchant);
	}

	@Override
	public void deleteMerchant(Integer merchantId) {
		merchantDao.deleteById(merchantId);
	}

	@Override
	public List<Merchant> getAllMerchant1() {
		return (List<Merchant>) merchantDao.findAllByActive();
	}

}
