
package org.capstore.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "created"}) 
public class Attraction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int attractionId;
	private String attractionName;
	private String attractionUrl;
	private String status;
	private String description;
	public Attraction(int attractionId, String attractionName, String attractionUrl, String status,
			String description) {
		super();
		this.attractionId = attractionId;
		this.attractionName = attractionName;
		this.attractionUrl = attractionUrl;
		this.status = status;
		this.description = description;
	}
	public int getAttractionId() {
		return attractionId;
	}
	public void setAttractionId(int attractionId) {
		this.attractionId = attractionId;
	}
	public String getAttractionName() {
		return attractionName;
	}
	public void setAttractionName(String attractionName) {
		this.attractionName = attractionName;
	}
	public String getAttractionUrl() {
		return attractionUrl;
	}
	public void setAttractionUrl(String attractionUrl) {
		this.attractionUrl = attractionUrl;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Attraction()
	{
		
	}

}
