package com.techietribe.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techietribe.dao.BranchDao;
import com.techietribe.dao.EmployeeDao;
import com.techietribe.model.Branch;
import com.techietribe.repository.BranchRepository;

@Service
public class BranchDaoImplementation implements BranchDao {

	
	@Autowired
	private BranchRepository branchRepository;

	@Override
	public List<Branch> findByLocationId(int locationId) {
		
		return branchRepository.findByLocationId(locationId);
	}
	
	
	
	

}
