package org.capstore.rest.controller;

import java.util.List;

import org.capstore.rest.model.Customer;
import org.capstore.rest.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CustomerRest {
	
	@Autowired
	private ICustomerService customerService;

	@GetMapping("/emails/{emailId}")
	public ResponseEntity<Customer> getCustomers(@PathVariable("emailId") String emailId){
		System.out.println(emailId);
		List<Customer> customer1=customerService.getAllCustomers();
		Customer cust=new Customer();
		for (Customer c : customer1) {
			if(c.getEmailId().toString().equals(emailId)) {
				cust.setCustomerId(c.getCustomerId());
				cust.setCustomerName(c.getCustomerName());
				cust.setPhoneNumber(c.getPhoneNumber());
			}
		}
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	} 
	
	/*@GetMapping("/emails/{emailId}")
	public String getCustomers(@PathVariable("emailId") String emailId){
		System.out.println(emailId);
		List<Customer> customer1=customerService.getAllCustomers();
		Customer cust=new Customer();
		for (Customer c : customer1) {
			if(c.getEmailId().toString().equals(emailId)) {
				cust.setCustomerId(c.getCustomerId());
				cust.setCustomerName(c.getCustomerName());
				cust.setPhoneNumber(c.getPhoneNumber());
				break;
			}
		}
		if(cust!=null) {
			System.out.println("abcdefghijk");
			String pass=cust.getPassword().toString();
			String url="http://localhost:8083/capstore/"+pass;
			return url;
		}
		return null;
	}*/ 
}
