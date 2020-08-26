package com.techietribe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking_tbl")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true,nullable=false)
	private int bookingId;
	@Column(unique=true)
	private long seatId;
	@Column(unique=true)
	private String emailId;
	
	
	
	@Column(columnDefinition = "varchar(255) default 'Pending'")
	private String bookigStatus;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public long getSeatId() {
		return seatId;
	}
	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBookigStatus() {
		return bookigStatus;
	}
	
	public void setBookigStatus(String bookigStatus) {
		this.bookigStatus = bookigStatus;
	}
		
}
