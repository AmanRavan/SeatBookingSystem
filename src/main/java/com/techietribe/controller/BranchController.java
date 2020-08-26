package com.techietribe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techietribe.dao.impl.BranchDaoImplementation;
import com.techietribe.model.Branch;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/branch")
public class BranchController {
	
	@Autowired
	private BranchDaoImplementation branchDaoImplementation;
	
	@GetMapping(value = "/{locationId}")
	public List<Branch> getBylocationId(@PathVariable int locationId) {
		
		return branchDaoImplementation.findByLocationId(locationId);

}
}
