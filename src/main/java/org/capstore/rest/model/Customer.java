package org.capstore.rest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int customerId;
	private String customerName;
	private String phoneNumber;
	@Column(unique=true)
	private String emailId;
	private Date dateOfBirth;
	private String password;
	@OneToMany(targetEntity = Address.class, mappedBy = "customer")
	private List<Address> address;
	private Date lastLogin;
	private String isActive;
	@OneToOne(targetEntity = Shipping.class, mappedBy = "customer")
	private Shipping shipping;
	@OneToMany(targetEntity = BankAccount.class, mappedBy = "customer")
	private List<BankAccount> bank;
	@OneToMany(targetEntity = ManagingCart.class, mappedBy = "customer")
	private List<ManagingCart> managingCart;
	@OneToMany(targetEntity = Order.class, mappedBy = "customer")
	private List<Order> order;
	
	@OneToMany(targetEntity = FeedBack.class, mappedBy = "customer")
	private List<FeedBack> feedBack;
	
	@OneToMany(targetEntity = ReturnOrders.class, mappedBy = "customer")
	private List<ReturnOrders> returnOrders; 

	@OneToMany(targetEntity = WishList.class, mappedBy = "customer")
	private List<WishList> wishList;
	
	public Customer() {
		
	}

	

	public Customer(int customerId, String customerName, String phoneNumber, String emailId, Date dateOfBirth,
			String password, List<Address> address, Date lastLogin, String isActive, Shipping shipping,
			List<BankAccount> bank, List<ManagingCart> managingCart, List<Order> order, List<FeedBack> feedBack,
			List<ReturnOrders> returnOrders, List<WishList> wishList) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.address = address;
		this.lastLogin = lastLogin;
		this.isActive = isActive;
		this.shipping = shipping;
		this.bank = bank;
		this.managingCart = managingCart;
		this.order = order;
		this.feedBack = feedBack;
		this.returnOrders = returnOrders;
		this.wishList = wishList;
	}



	public List<ReturnOrders> getReturnOrders() {
		return returnOrders;
	}



	public void setReturnOrders(List<ReturnOrders> returnOrders) {
		this.returnOrders = returnOrders;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public List<BankAccount> getBank() {
		return bank;
	}

	public void setBank(List<BankAccount> bank) {
		this.bank = bank;
	}

	public List<ManagingCart> getManagingCart() {
		return managingCart;
	}

	public void setManagingCart(List<ManagingCart> managingCart) {
		this.managingCart = managingCart;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public List<FeedBack> getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(List<FeedBack> feedBack) {
		this.feedBack = feedBack;
	}

	public List<WishList> getWishList() {
		return wishList;
	}

	public void setWishList(List<WishList> wishList) {
		this.wishList = wishList;
	}

	
	
	

}
