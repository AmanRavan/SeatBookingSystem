package com.techietribe.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techietribe.dao.FloorDetailsDao;
import com.techietribe.model.FloorDetails;
import com.techietribe.repository.FloorDetailsRepository;

@Service
public class FloorDetailsDaoImplementation implements FloorDetailsDao{
	
	@Autowired
	private FloorDetailsRepository	floorDetailsRepository;
	
	@Override
	public List<FloorDetails> findByBranchId(int branchId) {
		
		return floorDetailsRepository.findByBranchId(branchId) ;
	}

}
