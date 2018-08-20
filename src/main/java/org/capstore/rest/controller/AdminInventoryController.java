package org.capstore.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.capstore.rest.model.Inventory;

import org.capstore.rest.service.InventoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AdminInventoryController {
	@Autowired
    private InventoryService inventoryService;

	@GetMapping("/admininventory")
	public ResponseEntity<List<Inventory>> getAllInventory(){
		List<Inventory> inventories= inventoryService.getAllInventory();
		if(inventories.isEmpty()||inventories==null)
			return new ResponseEntity
				("Sorry! Inventory details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Inventory>>(inventories,HttpStatus.OK);
	}
	
	@RequestMapping("/admininventory/{productName}")
	public ResponseEntity<List<Inventory>> findInventory(@PathVariable("productName") String productName) {
		List<Inventory> inventory= inventoryService.getAllInventory();
		List<Inventory> inventory1=new ArrayList();
		
		
		for (Inventory c : inventory) {
			if(c.getProductName().contains(productName)) {
				
				Inventory inv=new Inventory();
				inv.setProductId(c.getProductId());
				inv.setProductName(c.getProductName());
				inv.setPrice(c.getPrice());
				inv.setCategory(c.getCategory());
				
				
				inventory1.add(inv);
			}
			
		}
		if(inventory1==null)
			return new ResponseEntity
				("Sorry! Inventory details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Inventory>>(inventory1,HttpStatus.OK);
	}
	@RequestMapping("/admininventory1/{category1}")
	public ResponseEntity<List<Inventory>> findInventory1(@PathVariable("category1") String category1) {
		List<Inventory> inventory= inventoryService.getAllInventory();
		List<Inventory> inventory1=new ArrayList();
		
		category1="Electronics";
		for (Inventory c : inventory) {
			if(c.getCategory().contains(category1)) {
				
				Inventory inv=new Inventory();
				inv.setProductId(c.getProductId());
				inv.setProductName(c.getProductName());
				inv.setPrice(c.getPrice());
				inv.setCategory(c.getCategory());
				
				
				inventory1.add(inv);
			}
			
		}
		if(inventory1==null)
			return new ResponseEntity
				("Sorry! Inventory details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Inventory>>(inventory1,HttpStatus.OK);
	}
	@RequestMapping("/admininventory2/{category2}")
	public ResponseEntity<List<Inventory>> findInventory2(@PathVariable("category2") String category2) {
		List<Inventory> inventory= inventoryService.getAllInventory();
		List<Inventory> inventory1=new ArrayList();
		
		category2="Clothing";
		for (Inventory c : inventory) {
			if(c.getCategory().contains(category2)) {
				
				Inventory inv=new Inventory();
				inv.setProductId(c.getProductId());
				inv.setProductName(c.getProductName());
				inv.setPrice(c.getPrice());
				inv.setCategory(c.getCategory());
				
				
				inventory1.add(inv);
			}
			
		}
		if(inventory1==null)
			return new ResponseEntity
				("Sorry! Inventory details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Inventory>>(inventory1,HttpStatus.OK);
	}
	
	@RequestMapping("/admininventory3/{category3}")
	public ResponseEntity<List<Inventory>> findInventory3(@PathVariable("category3") String category3) {
		List<Inventory> inventory= inventoryService.getAllInventory();
		List<Inventory> inventory1=new ArrayList();
		
		category3="Books";
		for (Inventory c : inventory) {
			if(c.getCategory().contains(category3)) {
				
				Inventory inv=new Inventory();
				inv.setProductId(c.getProductId());
				inv.setProductName(c.getProductName());
				inv.setPrice(c.getPrice());
				inv.setCategory(c.getCategory());
				
				
				inventory1.add(inv);
			}
			
		}
		if(inventory1==null)
			return new ResponseEntity
				("Sorry! Inventory details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Inventory>>(inventory1,HttpStatus.OK);
	}
}
