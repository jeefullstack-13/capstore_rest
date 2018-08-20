package org.capstore.rest.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.capstore.rest.model.Customer;
import org.capstore.rest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api/v1")
public class LoginRestController {
	@Autowired
	private LoginService loginService;
	private Customer customer;
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllPilots(){
		List<Customer> customers= loginService.getAll();
		if(customers.isEmpty()||customers==null)
			return new ResponseEntity
				("Sorry! Pilot details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}

	
	@PostMapping("/customers")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
		
		loginService.save(customer);
		
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}

	
	
	
	@GetMapping("/customers/{email}")
	public ResponseEntity<Customer> getOneByEmail(@PathVariable("email")String email){
		Customer cust= loginService.getOneByEmail(email);
		
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}

	
	
	
	
	@PutMapping(value = "/customersPasswordChange/{customerId}/{password}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("customerId")Integer customerId,@PathVariable("password")String password)
	{
		Customer customer = loginService.findById(customerId);
		customer.setPassword(password);
		
		loginService.save(customer);
		
		return new ResponseEntity<Customer>(customer,HttpStatus.OK); 
	}
	
	
	
		
	

	
	
	
	
	
	
	
	
}
