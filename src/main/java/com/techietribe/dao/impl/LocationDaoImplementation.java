package com.techietribe.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techietribe.dao.LocationDao;
import com.techietribe.model.Location;
import com.techietribe.repository.LocationRepository;

@Service
public class LocationDaoImplementation implements LocationDao {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public List<Location> findAll() {
		return locationRepository.findAll();
	}

}
