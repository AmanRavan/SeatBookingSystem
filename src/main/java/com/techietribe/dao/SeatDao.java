package com.techietribe.dao;

import java.util.List;
import java.util.Optional;


import com.techietribe.model.Seat;

public interface SeatDao {

	List<Seat> findByFloorId(int floorId);
	
	Seat findBySeatId(int seatId);
	
	
	void saveorUpdateSeat(Seat seat);
	Optional<Seat> findSeatBySeatId(int seatId);
}
