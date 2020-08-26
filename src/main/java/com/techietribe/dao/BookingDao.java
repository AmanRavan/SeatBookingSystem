package com.techietribe.dao;

import java.util.List;

import com.techietribe.model.Booking;

public interface  BookingDao {

	
	Booking findByEmailId(String emailId);
	void saveorUpdateBooking(Booking booking);
	List<Booking> findAllPendingBooking(Booking booking);
	

}
