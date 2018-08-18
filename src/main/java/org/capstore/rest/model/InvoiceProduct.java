package org.capstore.rest.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
public class InvoiceProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int invoiceProductId;
	@OneToMany(fetch=FetchType.LAZY)
private List<Inventory> inventory;
	@OneToOne(targetEntity = GenerateInvoice.class, mappedBy = "invoiceProduct")
	private GenerateInvoice generateInvoice;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="discountId")
	private Discount discount;
	public InvoiceProduct() {
		super();
	}

	public int getInvoiceProductId() {;
		return invoiceProductId;
	}

	public void setInvoiceProductId(int invoiceProductId) {
		this.invoiceProductId = invoiceProductId;
	}

	public InvoiceProduct(int invoiceProductId, GenerateInvoice generateInvoice) {
		super();
		this.invoiceProductId = invoiceProductId;
		this.generateInvoice = generateInvoice;
	}

	public GenerateInvoice getGenerateInvoice() {
		return generateInvoice;
	}

	public void setGenerateInvoice(GenerateInvoice generateInvoice) {
		this.generateInvoice = generateInvoice;
	}

	public List<Inventory> getInventory() {
		return inventory;
	}

	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public InvoiceProduct(int invoiceProductId, List<Inventory> inventory, GenerateInvoice generateInvoice,
			Discount discount) {
		super();
		this.invoiceProductId = invoiceProductId;
		this.inventory = inventory;
		this.generateInvoice = generateInvoice;
		this.discount = discount;
	}

	}
