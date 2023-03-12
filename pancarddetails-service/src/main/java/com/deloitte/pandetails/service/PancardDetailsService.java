package com.deloitte.pandetails.service;

import java.util.List;
import java.util.Optional;

import com.deloitte.pandetails.entity.PancardDetails;

public interface PancardDetailsService {
	
	void addPancardDetails(PancardDetails details); 
	
	List<PancardDetails> findAll();
	
	Optional<PancardDetails> getDetailsByPanNumber(String pannumber);

}
