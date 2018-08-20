package org.capstore.rest.service;

import java.util.List;
import org.capstore.rest.model.Merchant;

public interface MerchantService {
	public List<Merchant> getAllMerchant();
	public Merchant findMerchantById(Integer merchantId);
	public void saveMerchant(Merchant merchant);
	public void deleteMerchant(Integer merchantId);
	
	public List<Merchant> getAllMerchant1();
}
