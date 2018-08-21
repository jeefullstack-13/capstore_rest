package org.capstore.rest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int merchantId;
	private String merchantname;
	private String companyName;
	private String phoneNo;
	private String emailId;
	private String password;
	private String isCertified;
	private String isActive;
	private String status;
	private Date lastLogin; 
	
	@OneToMany(targetEntity=Address.class,mappedBy="merchant")
	private List<Address> address;
	@JsonIgnore
	@OneToMany(targetEntity=Inventory.class,mappedBy="merchant")
	private List<Inventory> inventory;
	@JsonIgnore
	@OneToMany(targetEntity=FeedBack.class,mappedBy="merchant")
	private List<FeedBack> feedback;
	public Merchant() {
		
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantname() {
		return merchantname;
	}
	public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIsCertified() {
		return isCertified;
	}
	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Inventory> getInventory() {
		return inventory;
	}
	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}
	public List<FeedBack> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<FeedBack> feedback) {
		this.feedback = feedback;
	}
	public Merchant(int merchantId, String merchantname, String companyName, String phoneNo, String emailId,
			String password, String isCertified, String isActive, String status, Date lastLogin, List<Address> address,
			List<Inventory> inventory, List<FeedBack> feedback) {
		super();
		this.merchantId = merchantId;
		this.merchantname = merchantname;
		this.companyName = companyName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.password = password;
		this.isCertified = isCertified;
		this.isActive = isActive;
		this.status = status;
		this.lastLogin = lastLogin;
		this.address = address;
		this.inventory = inventory;
		this.feedback = feedback;
	}
}