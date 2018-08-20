package org.capstore.rest.controller;


import java.util.List;

import org.capstore.rest.model.Admin;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Email;
import org.capstore.rest.service.IAdminService;
import org.capstore.rest.service.ICustomerService;
import org.capstore.rest.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmailController {

	@Autowired
	private IEmailService emailService;
	
	@Autowired
	private ICustomerService customerService;
	
	@Autowired
	private IAdminService adminService;
	
	@GetMapping("/emails")
	public ResponseEntity<List<Email>> getAllEmail(){
		List<Email> emails= emailService.getAll();
		if(emails.isEmpty()||emails==null)
			return new ResponseEntity("Sorry! Emails not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Email>>(emails,HttpStatus.OK);
	}
	
	@PostMapping("/emails")
	public ResponseEntity<Email> sendEmail(@RequestBody Email email){
		emailService.save(email);
		
		return new ResponseEntity<Email>(email,HttpStatus.OK);
	}
	
	
	@GetMapping("/customeremail")
	public ResponseEntity<List<Customer>> getCustomersEmail(){
		
		List<Customer> customer=customerService.getAllCustomerEmail();
		
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
	} 
	
	@GetMapping("/adminemail")
	public ResponseEntity<List<Admin>> getAdminEmail(){
		
		List<Admin> admin=adminService.getAdminEmail();
		
		return new ResponseEntity<List<Admin>>(admin,HttpStatus.OK);
	} 
	
}
