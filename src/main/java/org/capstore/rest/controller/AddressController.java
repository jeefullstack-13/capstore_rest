package org.capstore.rest.controller;

import java.util.List;

import org.capstore.rest.model.Address;
import org.capstore.rest.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AddressController {

	@Autowired
    private IAddressService addressService;
	
	@RequestMapping("/getAllAddress")
	public ResponseEntity<List<Address>> getAllAddress(){
		List<Address> address= addressService.getAllAddress();
		if(address.isEmpty()||address==null)
			return new ResponseEntity
				("Sorry! Merchant details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Address>>(address,HttpStatus.OK);
	}
}
