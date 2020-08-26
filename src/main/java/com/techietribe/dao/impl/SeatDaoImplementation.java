package com.techietribe.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techietribe.dao.SeatDao;
import com.techietribe.model.Employee;
import com.techietribe.model.Seat;
import com.techietribe.repository.SeatRepository;

@Service
public class SeatDaoImplementation implements SeatDao{

	@Autowired
	private SeatRepository seatRepository;

	@Override
	public List<Seat> findByFloorId(int floorId) {
		
		return seatRepository.findByFloorId(floorId);
	}

	@Override
	public Seat findBySeatId(int seatId) {
		
		return seatRepository.findBySeatId(seatId);
	}

	@Override
	public void saveorUpdateSeat(Seat seat) {
		seatRepository.save(seat);
		
	}

	@Override
	public Optional<Seat> findSeatBySeatId(int seatId) {
		// TODO Auto-generated method stub
		return seatRepository.findSeatBySeatId(seatId);
	}
	

}

	

	
	

