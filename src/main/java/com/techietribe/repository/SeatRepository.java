package com.techietribe.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.techietribe.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {

	List<Seat> findByFloorId(int floorId);
	Seat findBySeatId(int seatId);
	
	Optional<Seat> findSeatBySeatId(int seatId);
}
