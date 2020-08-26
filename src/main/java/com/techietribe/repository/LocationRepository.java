package com.techietribe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techietribe.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	

	List<Location> findAll(); 
	

}
