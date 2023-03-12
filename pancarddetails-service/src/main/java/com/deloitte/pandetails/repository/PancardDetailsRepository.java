package com.deloitte.pandetails.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deloitte.pandetails.entity.PancardDetails;

@Repository
public interface PancardDetailsRepository extends JpaRepository<PancardDetails, String>{
	
	@Query(value = "select pan from PancardDetails pan where pan.pancardNumber=?1")
	Optional<PancardDetails> getDetailsByPanNumber(String pannumber);

}
