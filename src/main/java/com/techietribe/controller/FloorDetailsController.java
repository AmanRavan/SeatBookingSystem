package com.techietribe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techietribe.dao.impl.FloorDetailsDaoImplementation;
import com.techietribe.model.Branch;
import com.techietribe.model.FloorDetails;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/floor")
public class FloorDetailsController {
	
	@Autowired
	private FloorDetailsDaoImplementation floorDetailsDaoImplementation;
	
	@GetMapping(value = "/{branchId}")
	public List<FloorDetails> getBylocationId(@PathVariable int branchId) {
		
		return floorDetailsDaoImplementation.findByBranchId(branchId);

}

}
