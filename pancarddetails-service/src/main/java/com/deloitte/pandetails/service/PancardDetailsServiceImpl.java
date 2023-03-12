package com.deloitte.pandetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.pandetails.entity.PancardDetails;
import com.deloitte.pandetails.exception.PancardDetailsNotAvailableException;
import com.deloitte.pandetails.exception.PancardNotAvailableException;
import com.deloitte.pandetails.repository.PancardDetailsRepository;

@Service
public class PancardDetailsServiceImpl implements PancardDetailsService{

	@Autowired
	PancardDetailsRepository repo;
	
	@Override
	public void addPancardDetails(PancardDetails details) {
		// TODO Auto-generated method stub
		repo.save(details);
	}

	@Override
	public List<PancardDetails> findAll() {
		// TODO Auto-generated method stub
		//return repo.findAll();
		List<PancardDetails> pancardList = repo.findAll();
		if(pancardList.isEmpty())
			throw new PancardDetailsNotAvailableException();
		return pancardList;
		
	}

	@Override
	public Optional<PancardDetails> getDetailsByPanNumber(String pannumber) {
		// TODO Auto-generated method stub
		 Optional<PancardDetails> details =  repo.getDetailsByPanNumber(pannumber);
		 if(details.isEmpty())
				throw new PancardNotAvailableException();
		 return details;
	}
	
	
	
}
