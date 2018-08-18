package org.capstore.rest.controller;

import java.util.ArrayList;
import java.util.List;


import org.capstore.rest.model.Merchant;

import org.capstore.rest.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AdminMerchantController {
	@Autowired
    private MerchantService merchantService;

	@GetMapping("/adminmerchant")
	public ResponseEntity<List<Merchant>> getAllMerchant(){
		List<Merchant> merchants= merchantService.getAllMerchant();
		if(merchants.isEmpty()||merchants==null)
			return new ResponseEntity
				("Sorry! Pilot details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Merchant>>(merchants,HttpStatus.OK);
	}
	
	@RequestMapping("/adminmerchant/{name}")
	public ResponseEntity<List<Merchant>> findMerchant(@PathVariable("name") String name) {
		List<Merchant> merchant= merchantService.getAllMerchant();
		List<Merchant> merchant1=new ArrayList();
		
		
		for (Merchant c : merchant) {
			if(c.getName().equals(name)) {
				
				Merchant mer=new Merchant();
				mer.setMerchantId(c.getMerchantId());
				mer.setName(c.getName());
				mer.setCompanyName(c.getCompanyName());
				mer.setPhoneNo(c.getPhoneNo());
				
				
				merchant1.add(mer);
			}
		}
		if(merchant1==null)
			return new ResponseEntity
				("Sorry! Pilot details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Merchant>>(merchant1,HttpStatus.OK);
	}
}
