package com.techietribe.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class Branch {
	
	
	@Id
	@Column(unique = true, nullable = false)
	private int branchId;
	private int locationId;
	private String branchName;
	private int totalFloors;
	
	
	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id",referencedColumnName = "location_id")
	private Location location;
	
	@OneToOne(mappedBy = "branch")
	private FloorDetails floorDetails;*/
	
	 

	/*public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}*/
	public int getBranchId() {
		return branchId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getTotalFloors() {
		return totalFloors;
	}
	public void setTotalFloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}

}
