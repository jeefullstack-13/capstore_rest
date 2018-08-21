package org.capstore.rest.controller;

import java.util.List;
import org.capstore.rest.model.Brand;
import org.capstore.rest.model.Category;
import org.capstore.rest.model.Inventory;
import org.capstore.rest.model.Merchant;
import org.capstore.rest.service.MerchInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v2")
public class MerchantInventoryController {
	@Autowired
	private MerchInventoryService inventoryService;
	
	 
	@GetMapping("/brands")
	public ResponseEntity<List<Brand>> getAllBrands(){
		List<Brand> brands= inventoryService.getAllBrands();
		if(brands.isEmpty()||brands==null)
			return new ResponseEntity
				("Sorry! Brand details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Brand>>(brands,HttpStatus.OK);
				
	}
			
	@GetMapping("/categories")
	public ResponseEntity<List<Category>> getAllCategories(){
		List<Category> categories= inventoryService.getAllCategories();
		if(categories.isEmpty()||categories==null)
			return new ResponseEntity
				("Sorry! Categories details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Category>>(categories,HttpStatus.OK);
				
	} 
		
	
	@GetMapping("/prods")
	public ResponseEntity<List<Inventory>> getAllProds(){
		List<Inventory> products= inventoryService.getAll();
		if(products.isEmpty()||products==null)
			return new ResponseEntity
				("Sorry! Products details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Inventory>>(products,HttpStatus.OK);
	}
		
	
	@GetMapping("/merchantProfile/{merchantId}")
	public ResponseEntity<Merchant> findPilot(@PathVariable ("merchantId") Integer merchantId ) {
		
		Merchant merch=inventoryService.getMerch(merchantId);
		if(merch==null)
			return new ResponseEntity
				("Sorry! Pilot details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<Merchant>(merch,HttpStatus.OK);
	} 
	
	@GetMapping("/merchantProfile")
	public ResponseEntity<List<Merchant>> getAllCustomer(){
		List<Merchant> merch= inventoryService.getAllMerch();
		if(merch.isEmpty()||merch==null)
			return new ResponseEntity
				("Sorry! Customer details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Merchant>>(merch,HttpStatus.OK);
	} 
	
	
	@GetMapping("/prods/{productName}")
	public ResponseEntity<Inventory> getAllDetails(@PathVariable ("productName") String productName){
		Inventory invent= inventoryService.getProduct(productName);
		if(invent==null)
			return new ResponseEntity
				("Sorry! Customer details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<Inventory>(invent,HttpStatus.OK);
	} 
	
	
	@PostMapping("/addProd")
	public ResponseEntity<Inventory> createProduct(@RequestBody Inventory product) {
		inventoryService.save(product);
		
		return new ResponseEntity<Inventory>(product,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/products/{productId}")
	public void deleteProduct(@PathVariable("productId") Integer productId) {
		
		inventoryService.delete(productId);
		
	}
	
}
