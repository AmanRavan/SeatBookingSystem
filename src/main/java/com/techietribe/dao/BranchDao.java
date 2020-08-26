package com.techietribe.dao;

import java.util.List;

import com.techietribe.model.Branch;


public interface BranchDao {
	
	

	
	
	List<Branch> findByLocationId(int locationId);

}
