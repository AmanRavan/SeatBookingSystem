package com.techietribe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techietribe.dao.impl.SeatDaoImplementation;

import com.techietribe.model.Seat;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/seatDetails")
public class SeatController {
	
	
	//private Seat seat;
	
	@Autowired
	private SeatDaoImplementation seatDaoImplementation;
	
	@GetMapping(value="/{floorId}")
	public List<Seat> getByFloorId(@PathVariable int floorId){
	return seatDaoImplementation.findByFloorId(floorId);
	}
	
	@PostMapping
	public ResponseEntity<?> saveSeat(@RequestBody Seat seat) {
		seatDaoImplementation.saveorUpdateSeat(seat);
		return new ResponseEntity("update sucessfully seat successfully", HttpStatus.OK);
	}
	
	
	
	 //   http://localhost:2222/updateseatsetails/9012
	
	
	
	@GetMapping("/update/{seatId}") 
	public Seat updateSeat(@PathVariable("seatId") int seatId) {
		Optional<Seat> seats=seatDaoImplementation.findSeatBySeatId(seatId);
		Seat seat1=seats.get();	
	    seat1.setSeatStatus("Pending");
		seatDaoImplementation.saveorUpdateSeat(seat1);
		return null;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////
	
	@PostMapping(value="/seat/updating")
	public Seat statusFinal(@RequestParam(value="seatId", required=true) int seatId , @RequestBody Seat seat) {
		Optional<Seat> seat1=seatDaoImplementation.findSeatBySeatId(seatId);
		Seat seat2= seat1.get();
		seat2.setSeatStatus(seat.getSeatStatus());
		
		
		
		return null;
		
	}
	
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////
/*
 * @PostMapping("/update/{seatId}") 
 
	public  Seat updatedSeats(@PathVariable int seatId) {
		if(seatDaoImplementation.findBySeatId(seatId)!=null) {
			seat.setSeatStatus("Booked");
			System.out.println(seat);
		}
		return seat;
	}*/	
}
