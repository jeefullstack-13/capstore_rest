package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Merchant;




public interface IRegMerchantService {

	public void saveMerchant(Merchant merchant);
	public List<Merchant> getAllMerchants();
	public Merchant getValidMerchant(String username, String password);
}
