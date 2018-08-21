package org.capstore.rest.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.capstore.rest.model.Attraction;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Email;
import org.capstore.rest.service.UploadingServiceInterface;
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
@RequestMapping("/api/v3")
public class MyControl {

	@Autowired
	private UploadingServiceInterface pilotDBService;
	
	/*Email e=new Email();
	@GetMapping("/pro")
	public void getAllCustomer(){
		System.out.println("I am in controller");
		System.out.println("I am in pilots");
		List<Customer> customers= pilotDBService.getAllCustomer();
		List<Inventory> inventory=pilotDBService.getAllInventory();
		//if(customers.isEmpty()||customers==null)
		
		int i;
		int j;
		//if(inventory.isEmpty()||inventory==null)
		for(i=0;i<customers.size()-1;i++)
		{for(j=0;j<inventory.size()-1;i++)
		{
			e.seteID(e.geteID()+1);
		e.setFrom_emailId("admin@gmail.com");
		e.setTo_emailId(customers.get(i).getEmail());
		e.setBody(inventory.get(j).getDescription());
		e.setSubject("promotion");
		e.setDate(new Date());
		
		pilotDBService.saveMail(e);
		}	
		}
		
    		//return null;
		//return new ResponseEntity<List<Email>>(,HttpStatus.OK);
	}*/
	/*
	@GetMapping("/")
	public ResponseEntity<List<UploadImage>> getAllImage()
	{
		List<UploadImage> images=pilotDBService.getAllImage();
		return new ResponseEntity<List<UploadImage>>(images,HttpStatus.OK);
	}*/
	
	@GetMapping("/maxId")
	public Integer getMaxId()
	{System.out.println("id : controller");
	  int i=pilotDBService.getMaxId();
	  System.out.println("i is"+i);
	  
	  
		return i;
	}
	
	@PostMapping("/put1")
	public void putImage(@RequestBody Attraction product)
	{System.out.println("Put : controller");
		pilotDBService.save(product);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Attraction>> getAllImages(){
		System.out.println("getall : controller");
		//System.out.println("I am in pilots");
		List<Attraction> products= pilotDBService.getAllProducts();
		if(products.isEmpty()||products==null)
			return new ResponseEntity
				("Sorry! Image details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Attraction>>(products,HttpStatus.OK);
	}
	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		System.out.println("getall : customer");
		
		Date date=new Date();
		Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.add(Calendar.DATE, -10); //minus number would decrement the days
	    Date d3= cal.getTime();
		
		//System.out.println("I am in pilots");
		List<Customer> products= pilotDBService.getAllCustomer(d3);
		if(products.isEmpty()||products==null)
			return new ResponseEntity
				("Sorry! Customer details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Customer>>(products,HttpStatus.OK);
	}
	
	
	@GetMapping("/getAttractionById/{id}")
	public ResponseEntity<Attraction> getAttraction(@PathVariable("id") Integer id){
		System.out.println("i am in pilots pilotId");
		//Pilot pilot= 
		Attraction attraction=pilotDBService.findAttraction(id);
		System.out.println("Pilot in controller of rest"+attraction);
		//if(pilot==null)
			//return new ResponseEntity
				//("Sorry! Pilot details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<Attraction>(attraction,HttpStatus.OK);
		
			}
	
	@PostMapping("/sentMail")
	public void putMail(@RequestBody Email email)
	{System.out.println("Email : restcontroller");
		pilotDBService.saveMail(email);
	}
	
	
}
