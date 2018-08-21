package org.capstore.rest.controller;

import java.util.List;

import org.capstore.rest.model.Admin;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Merchant;
import org.capstore.rest.service.IAdminLogin;
import org.capstore.rest.service.IRegCustomerService;
import org.capstore.rest.service.IRegMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1")
public class RController {
	

	@Autowired
	private IRegCustomerService userServiceCust ;
	@Autowired
	private IRegMerchantService userServiceMerchant;
	@Autowired
	private IAdminLogin adminLoginService;
	

	@GetMapping("/userCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer> customers= userServiceCust.getAllCustomers();
		if(customers.isEmpty()||customers==null)
			return new ResponseEntity ("Sorry! Customer details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
	@PostMapping("/userCustomer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cust){
		userServiceCust.saveCustomer(cust);
		
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/userMerchant")
	public ResponseEntity<List<Merchant>> getAllMerchant(){
		List<Merchant> merchants= userServiceMerchant.getAllMerchants();
		if(merchants.isEmpty()||merchants==null)
			return new ResponseEntity ("Sorry! Merchant details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Merchant>>(merchants,HttpStatus.OK);
	}
	
	@PostMapping("/userMerchant")
	public ResponseEntity<Merchant> createMerchant(@RequestBody Merchant mert){
		userServiceMerchant.saveMerchant(mert);
		return new ResponseEntity<Merchant>(mert,HttpStatus.OK);
	}
	
	@GetMapping("/adminLogin/{email}/{password}")
	public ResponseEntity <Admin> getAdmin(@PathVariable("email")String email, @PathVariable("password") String password){
		Admin admin= adminLoginService.getAdmin(email,password);
		
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
	}
	
	/*---------------------   Merchant ---------------------------------------*/
	
	@GetMapping("/merchantLogin/{email}/{password}")
	public ResponseEntity <Merchant> getValidMerchant(@PathVariable("email")String email, @PathVariable("password") String password){
		Merchant merchant= userServiceMerchant.getValidMerchant(email,password);
		
		return new ResponseEntity<Merchant>(merchant,HttpStatus.OK);
	}
	
	
	
	
/*---------------------   Customer ---------------------------------------*/
	
	@GetMapping("/customerLogin/{email}/{password}")
	public ResponseEntity <Customer> getValidCustomer(@PathVariable("email")String email, @PathVariable("password") String password){
		Customer customer= userServiceCust.getValidCustomer(email,password);
		
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
}	
