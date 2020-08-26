package com.techietribe.dao;

import java.util.List;

import com.techietribe.model.FloorDetails;

public interface FloorDetailsDao {

	
	List<FloorDetails> findByBranchId(int branchId);
}
