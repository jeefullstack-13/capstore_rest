package org.capstore.rest.service;

import java.util.Date;
import java.util.List;

import org.capstore.rest.model.Attraction;
import org.capstore.rest.model.Customer;
import org.capstore.rest.model.Email;
import org.springframework.beans.factory.annotation.Autowired;







public interface UploadingServiceInterface {
	
	//public void save(Pilot pilot);
	//public List<Pilot> getAllPilots();
/*	public Pilot findPilot(Integer pilotId);
	public List<Pilot> deletePilot(Integer pilotId);
	public List<Pilot> createPilot(Pilot pilot);
	public List<Pilot> updatePilot(Pilot pilot);*/
	
/*	public List<Customer> getAllCustomer();
	public List<Inventory> getAllInventory();
	
	public void saveMail(Email mail);*/
	//public List<UploadImage> getAllImage();
	
	
	public int getMaxId();

	public void save(Attraction product);

	public List<Attraction> getAllProducts();

	public List<Customer> getAllCustomer(Date d);

	public Attraction findAttraction(Integer id);

	public void saveMail(Email email);
}
