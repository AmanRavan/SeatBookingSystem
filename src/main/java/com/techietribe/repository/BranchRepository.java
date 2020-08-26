package com.techietribe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techietribe.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{
	
	 List<Branch> findByLocationId(int locationId);

}
