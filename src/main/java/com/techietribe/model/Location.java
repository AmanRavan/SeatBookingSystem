 package com.techietribe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "location")
public class Location {
	@Id
	@Column(unique = true)
	private int locationId;
	
	private String locationName;
	
	//@OneToOne(mappedBy = "location")
	//private Branch branch;
	

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	
	}

