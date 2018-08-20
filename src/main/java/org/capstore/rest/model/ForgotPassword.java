package org.capstore.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class ForgotPassword {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
private int fID;
private String emailId;
private String link;
private Date date;
private boolean isAccessed;
public ForgotPassword() {
	
}



public int getfID() {
	return fID;
}



public void setfID(int fID) {
	this.fID = fID;
}



public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getLink() {
	return link;
}

public void setLink(String link) {
	this.link = link;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public boolean isAccessed() {
	return isAccessed;
}

public void setAccessed(boolean isAccessed) {
	this.isAccessed = isAccessed;
}



public ForgotPassword(int fID, String emailId, String link, Date date, boolean isAccessed) {
	super();
	this.fID = fID;
	this.emailId = emailId;
	this.link = link;
	this.date = date;
	this.isAccessed = isAccessed;
}




}
