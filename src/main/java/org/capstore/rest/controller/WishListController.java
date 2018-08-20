package org.capstore.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.capstore.rest.model.Category;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Inventory;
import org.capstore.rest.model.WishList;
import org.capstore.rest.service.ICustomerService;
import org.capstore.rest.service.InventoryService;
import org.capstore.rest.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CapStore/WishList")
public class WishListController {
	
	@Autowired
	private WishListService wishListService;
	
	@Autowired
	private ICustomerService customerService;
	
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/wishLists/{custId}")
	public ResponseEntity<List<WishList>> getWishList(@PathVariable("custId") Integer custId) {
		List<WishList> wishList = wishListService.getAll(custId);
		
		System.out.println("Products:" + wishList);
		if(wishList == null || wishList.isEmpty()) {
			return new ResponseEntity("WishList not available", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<WishList>>(wishList, HttpStatus.OK);
	}
	
	@PostMapping("/wishLists/{custId}/{prodId}")
	public ResponseEntity<WishList> createWishList(@PathVariable("custId") Integer custId, @PathVariable("prodId") Integer prodId,@PathVariable("category3") String category3) {
		/*WishList wishList = new WishList();
		Customer customer = customerService.findOne(custId);
		Inventory inventory = inventoryService.findOne(prodId);
		
		wishList.setCustomer(customer);
		wishList.setInventory(inventory);
		wishList.setActive(true);
		wishListService.save(wishList);
		return new ResponseEntity<WishList>(HttpStatus.OK);*/
		List<Inventory> inventory= inventoryService.getAllInventory();
		List<Inventory> inventory1=new ArrayList();
		
		category3="Books";
		for (Inventory c : inventory) {
			Category category= c.getCategory();
			String cat=category.getCategoryName();
			if(cat.equals(category3)) {
			
				Inventory inv=new Inventory();
				inv.setProductId(c.getProductId());
				inv.setProductName(c.getProductName());
				inv.setPrice(c.getPrice());
				inv.setCategory(c.getCategory());
				inv.setDescription(c.getDescription());
				
				inventory1.add(inv);
			}
		}
		if(inventory1==null)
			return new ResponseEntity
				("Sorry! Inventory details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<WishList>(HttpStatus.OK);
	
		
}
	@PutMapping("/wishLists/{custId}/{prodId}/{wishId}")
	public ResponseEntity<WishList> updateWishList(@PathVariable("custId") Integer custId, @PathVariable("prodId") Integer prodId,
			@PathVariable("wishId") Integer wishId) {
		
		WishList wishList1 = wishListService.findById(wishId);
		wishList1.setActive(false);
		wishListService.save(wishList1);
		return new ResponseEntity<WishList>(HttpStatus.OK);

	}
	
	/*
	 * @RequestMapping("/admininventory1/electronics")
	public ResponseEntity<List<Inventory>> findInventory1() {
		List<Inventory> inventory= inventoryService.getAllInventory();
		List<Inventory> inventory1=new ArrayList();
		
		String category1="Electronics";
		for (Inventory c : inventory) {
			if(c.getCategory().contains(category1)) {
				
				Inventory inv=new Inventory();
				inv.setProductId(c.getProductId());
				inv.setProductName(c.getProductName());
				inv.setPrice(c.getPrice());
				inv.setCategory(c.getCategory());
				
				
				inventory1.add(inv);
			}
	 */
}
