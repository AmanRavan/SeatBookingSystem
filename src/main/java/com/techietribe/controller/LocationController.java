package com.techietribe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.techietribe.dao.impl.LocationDaoImplementation;
import com.techietribe.model.Location;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/locationlist")
public class LocationController {
	
	@Autowired
	private LocationDaoImplementation locationDaoImplementation;
	
    @GetMapping(value="/list")
	public List<Location> getAllLocations(){
    	System.out.println("hello");
		return locationDaoImplementation.findAll();
		
	}
	
  
	
	
}
