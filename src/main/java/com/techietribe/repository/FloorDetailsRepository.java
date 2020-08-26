package com.techietribe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techietribe.model.FloorDetails;

@Repository
public interface FloorDetailsRepository extends JpaRepository<FloorDetails, Integer> {

	List<FloorDetails> findByBranchId(int branchId);
}
