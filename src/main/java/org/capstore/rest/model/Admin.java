package org.capstore.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	private String email;
	private String password;
	private Date lastLogin;



}
