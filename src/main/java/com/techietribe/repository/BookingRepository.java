package com.techietribe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techietribe.model.Booking;


@Repository
public interface  BookingRepository extends JpaRepository<Booking, Integer>{

	Booking findByEmailId(String emailId );
	
	@Query(value="Select * from booking_tbl where bookig_status like 'Pending'",nativeQuery = true)
	List<Booking> findAllPendingBooking(Booking booking);
	
}
