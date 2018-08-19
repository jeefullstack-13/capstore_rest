package org.capstore.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.capstore.rest.model.Customer;

import org.capstore.rest.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class AdminCustomerController {

    @Autowired
    private ICustomerService customerService;


    	
    	@GetMapping("/admincustomer")
    	public ResponseEntity<List<Customer>> getAllCustomers(){
    		List<Customer> customers= customerService.getAllCustomer();
    		if(customers.isEmpty()||customers==null)
    			return new ResponseEntity
    				("Sorry! Customer details not available!",HttpStatus.NOT_FOUND);
    		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
    	}
    	
    /*	@GetMapping("/admincustomer/{customerId}")
    	public ResponseEntity<Customer> findPilot(@PathVariable("customerId") Integer customerId) {
    		
    		Customer customer1=customerService.findOne(customerId);
    		if(customer1==null)
    			return new ResponseEntity
    				("Sorry! Pilot details not available!",HttpStatus.NOT_FOUND);
    		return new ResponseEntity<Customer>(customer1,HttpStatus.OK);
    	}*/
    	@RequestMapping("/admincustomer/{customerName}")
    	public ResponseEntity<List<Customer>> findCustomer(@PathVariable("customerName") String customerName) {
    		List<Customer> customer= customerService.getAllCustomer();
    		List<Customer> customer1=new ArrayList();
    		
    		
    		for (Customer c : customer) {
				if(c.getCustomerName().contains(customerName)) {
					
					Customer cust=new Customer();
					cust.setCustomerId(c.getCustomerId());
					cust.setCustomerName(c.getCustomerName());
					cust.setEmailId(c.getEmailId());
					
					
					customer1.add(cust);
				}
						
			}
    		if(customer1==null)
    			return new ResponseEntity
    				("Sorry! Customer details not available!",HttpStatus.NOT_FOUND);
    		return new ResponseEntity<List<Customer>>(customer1,HttpStatus.OK);
    	}
    	
    	
    	
	
}
