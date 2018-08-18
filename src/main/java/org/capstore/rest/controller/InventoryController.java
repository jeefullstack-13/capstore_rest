package org.capstore.rest.controller;

import java.util.List;

import org.capstore.rest.model.Inventory;
import org.capstore.rest.service.InventoryService;
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
public class InventoryController {
	@Autowired
	private InventoryService inventoryService;
	private Inventory inventory;
	@GetMapping("/prods")
	public ResponseEntity<List<Inventory>> getAllProds(){
		List<Inventory> pilots= inventoryService.getAll();
		if(pilots.isEmpty()||pilots==null)
			return new ResponseEntity
				("Sorry! Pilot details not available!",HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Inventory>>(pilots,HttpStatus.OK);
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<Inventory> createProduct(@RequestBody  Inventory product) {
		inventoryService.save(product);
		
		return new ResponseEntity<Inventory>(product,HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/products/{productId}")
	public void deleteProduct(@PathVariable("productId") Integer productId) {
		
		inventoryService.delete(productId);
		
	}
	
	/*@GetMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") Integer productId,ModelMap map) {
		inventory=inventoryService.findProduct(productId);
		System.out.println(inventory);
		return "redirect:/PilotForm";		
	}
*/
	
	
}
