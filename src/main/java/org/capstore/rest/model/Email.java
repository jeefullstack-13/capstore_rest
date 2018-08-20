package org.capstore.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eID;
	private String from_emailId;
	private String to_emailId;
	private String body;
	private String subject;
	private Date date;
	public Email() {
		
	}
	
	
	public int geteID() {
		return eID;
	}


	public void seteID(int eID) {
		this.eID = eID;
	}


	public String getFrom_emailId() {
		return from_emailId;
	}
	public void setFrom_emailId(String from_emailId) {
		this.from_emailId = from_emailId;
	}
	public String getTo_emailId() {
		return to_emailId;
	}
	public void setTo_emailId(String to_emailId) {
		this.to_emailId = to_emailId;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


	public Email(int eID, String from_emailId, String to_emailId, String body, String subject, Date date) {
		super();
		this.eID = eID;
		this.from_emailId = from_emailId;
		this.to_emailId = to_emailId;
		this.body = body;
		this.subject = subject;
		this.date = date;
	}
	

}
