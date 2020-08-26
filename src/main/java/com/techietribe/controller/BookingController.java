package com.techietribe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techietribe.dao.impl.BookingDaoImplementation;
import com.techietribe.model.Booking;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/seatBookingRequest")
public class BookingController {
	
	private Booking booking;
	@Autowired
	private BookingDaoImplementation bookingDaoImplementation;
	
	@PostMapping
	public ResponseEntity<?> saveEmailAndSeat(@RequestBody Booking booking){
		booking.setBookigStatus("Pending");
		bookingDaoImplementation.saveorUpdateBooking(booking);
		//return new ResponseEntity("Updated email and seat 5 ",HttpStatus.OK);
		return null;
	}
	
	@GetMapping(value="/pending")
	public List<Booking> getAllPendingBooking(Booking booking){
		
		return bookingDaoImplementation.findAllPendingBooking(booking);
	}
	

}
