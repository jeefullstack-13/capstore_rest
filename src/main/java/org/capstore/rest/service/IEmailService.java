package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Email;



public interface IEmailService {

	public List<Email> getAll();

	public void save(Email email);

	

}
