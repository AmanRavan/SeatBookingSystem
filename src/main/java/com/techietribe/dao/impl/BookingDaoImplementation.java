package com.techietribe.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techietribe.dao.BookingDao;
import com.techietribe.model.Booking;
import com.techietribe.repository.BookingRepository;

@Service
public class BookingDaoImplementation implements BookingDao {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public Booking findByEmailId(String emailId) {
	return bookingRepository.findByEmailId(emailId);
	}

	@Override
	public void saveorUpdateBooking(Booking booking) {
		bookingRepository.save(booking);
		
	}

	

	@Override
	public List<Booking> findAllPendingBooking(Booking booking) {
		
		return bookingRepository.findAllPendingBooking(booking);
	}

}
