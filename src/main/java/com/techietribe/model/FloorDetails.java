package com.techietribe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "floor_details")
public class FloorDetails {

	@Id
	@Column(unique = true, nullable = false)
	private int floorId;
	// @OneToOne(cascade = CascadeType.ALL)
     //@JoinColumn(name = "branch_id",referencedColumnName = "branch_id")
	private int branchId;
	 
	private int floorNo;
//	private int totalSeats;
	//private int bookedSeats;
	//private int availableSeats;
	
	
	
//	@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "branch_id",referencedColumnName = "branch_id")
	//private Branch branch;
	
	
	/*public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}*/
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
/*	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}*/
	
}
