package org.capstore.rest.controller;

import java.util.List;

import org.capstore.rest.model.Admin;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Merchant;
import org.capstore.rest.service.AdminService;
import org.capstore.rest.service.IPasswordService;
import org.capstore.rest.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ForgotRestController {
	
	@Autowired
	private IPasswordService passwordService;
	
	@Autowired
	private MerchantService merchantService;
	
	@Autowired
	private AdminService adminService;

	@GetMapping("/customer/{emailId}")
	public ResponseEntity<Customer> getCustomers(@PathVariable("emailId") String emailId){
		System.out.println(emailId);
		List<Customer> customer1=passwordService.getAllCustomers();
		Customer cust=new Customer();
		for (Customer c : customer1) {
			if(c.getEmailId().toString().equals(emailId)) {
				cust.setCustomerId(c.getCustomerId());
				cust.setCustomerName(c.getCustomerName());
				cust.setPhoneNumber(c.getPhoneNumber());
				cust.setEmailId(c.getEmailId());
				cust.setPassword(c.getPassword());
			}
		}
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	} 
	
	@GetMapping("/merchant/{emailId}")
	public ResponseEntity<Merchant> getMerchants(@PathVariable("emailId") String emailId){
		System.out.println(emailId);
		List<Merchant> merchant1=merchantService.getAllMerchant();
		Merchant merchant=new Merchant();
		for (Merchant m : merchant1) {
			if(m.getEmailId().toString().equals(emailId)) {
				merchant.setMerchantId(m.getMerchantId());
				merchant.setName(m.getName());
				merchant.setPhoneNo(m.getPhoneNo());
				merchant.setEmailId(m.getEmailId());
				merchant.setPassword(m.getPassword());
			}
		}
		return new ResponseEntity<Merchant>(merchant, HttpStatus.OK);
	}
	
	@GetMapping("/admin/{emailId}")
	public ResponseEntity<Admin> getAdmin(@PathVariable("emailId") String emailId){
		System.out.println(emailId);
		List<Admin> admin1=adminService.getAdminEmail();
		Admin admin=new Admin();
		for (Admin a : admin1) {
			if(a.getEmail().toString().equals(emailId)) {
				admin.setAdminId(a.getAdminId());
				admin.setEmail(a.getEmail());
				admin.setLastLogin(a.getLastLogin());
				admin.setPassword(a.getPassword());
			}
		}
		return new ResponseEntity<Admin>(admin, HttpStatus.OK);
	}
	
	
}
