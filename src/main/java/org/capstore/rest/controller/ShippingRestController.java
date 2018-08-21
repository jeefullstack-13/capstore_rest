package org.capstore.rest.controller;

import java.util.List;


import org.capstore.rest.model.Address;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Email;
import org.capstore.rest.model.Order;
import org.capstore.rest.model.Shipping;
import org.capstore.rest.service.IShippingService;
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
@RequestMapping("/shippingRest")
public class ShippingRestController {
@Autowired
private IShippingService shippingService;
static Customer customer;
static Address newAdd;
@GetMapping("/address/{custId}")
public ResponseEntity<List<Address>> getAllPilots(@PathVariable("custId") Integer custId){
	List<Address> address=shippingService.findAll(custId);
 if(address.isEmpty()|| address==null)
	 return new ResponseEntity("sorry address with id does not exist",HttpStatus.NOT_FOUND);
 return new ResponseEntity<List<Address>>(address,HttpStatus.OK);
}
@PostMapping("/addres/{custId}")
public ResponseEntity<Address> addAddress(@PathVariable("custId") Integer custId,@RequestBody Address address){
	customer=shippingService.findCustomer(custId);
	address.setCustomer(customer);
	shippingService.addAddress(address);
	newAdd=address;
	return new ResponseEntity<Address>(address,HttpStatus.OK);
}
@PostMapping("/shipping/{orderId}")
public ResponseEntity<Shipping> createShippingDeatils(@RequestBody Shipping shipping,
		@PathVariable("orderId") Integer orderId){
	Order order=shippingService.findOrder(orderId);
	shipping.setCustomer(customer);
	shipping.setOrder(order);
	if(shipping.getShippingAddress()==null) {
		shipping.setShippingAddress(newAdd);
	}
	shippingService.addShipping(shipping);
		return new ResponseEntity<Shipping>(shipping,HttpStatus.OK);
}
@GetMapping("/allShipping")
public ResponseEntity<List<Shipping>> getShippingDetails(){
	List<Shipping> shipping=shippingService.getShipping();
 if(shipping.isEmpty()|| shipping==null)
	 return new ResponseEntity("sorry address with id does not exist",HttpStatus.NOT_FOUND);
 return new ResponseEntity<List<Shipping>>(shipping,HttpStatus.OK);
}	
@PostMapping("/email")
public ResponseEntity<Email> createEmail(@RequestBody Email email){
	email.setTo_emailId(customer.getEmailId());
	shippingService.addEmail(email);
	return new ResponseEntity<Email>(email,HttpStatus.OK);
}
@GetMapping("/allEmail")
public ResponseEntity<List<Email>> getEmailDetails(){
	List<Email> email=shippingService.getEmail();
 if(email.isEmpty()|| email==null)
	 return new ResponseEntity("sorry address with id does not exist",HttpStatus.NOT_FOUND);
 return new ResponseEntity<List<Email>>(email,HttpStatus.OK);
}
/*@GetMapping("/order/{orderId}")
public ResponseEntity<Order> getOrder(@PathVariable("orderId") Integer orderId){
	Order order=shippingService.findOrder(orderId);
 if(order==null)
	 return new ResponseEntity("sorry order with id does not exist",HttpStatus.NOT_FOUND);
 return new ResponseEntity<Order>(order,HttpStatus.OK);
}*/

/*@GetMapping("/customer/{custId}")
public ResponseEntity<Customer> getCustomer(@PathVariable("custId") Integer custId){
	Customer customer=shippingService.findCustomer(custId);
 if(customer==null)
	 return new ResponseEntity("sorry order with id does not exist",HttpStatus.NOT_FOUND);
 return new ResponseEntity<Customer>(customer,HttpStatus.OK);
}*/
}
