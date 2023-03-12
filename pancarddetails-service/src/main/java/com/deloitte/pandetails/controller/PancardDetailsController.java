package com.deloitte.pandetails.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.pandetails.entity.PancardDetails;
import com.deloitte.pandetails.exception.PancardNotAvailableException;
import com.deloitte.pandetails.service.PancardDetailsService;

@RestController
@RequestMapping("/pancarddetails")
public class PancardDetailsController {
	
	@Autowired 
	PancardDetailsService service;
	
	@PostMapping
	public ResponseEntity<String> addPancardDetails(@RequestBody PancardDetails details){
		
		service.addPancardDetails(details);
		return new ResponseEntity<String>("pancard details added successfully!!!",HttpStatus.OK);
	}

	@GetMapping 
	public ResponseEntity<List<PancardDetails>> getAllDetails(){
		
		List<PancardDetails> allPanDetails = service.findAll();
		return new ResponseEntity<List<PancardDetails>>(allPanDetails,HttpStatus.OK);
			
	}
	
	@GetMapping("/{pannumber}")
	public ResponseEntity<Optional<PancardDetails>> getDetailsByPancardNumber(@PathVariable("pannumber") String pannumber)
	{
		Optional<PancardDetails> details = service.getDetailsByPanNumber(pannumber);
	
		return new ResponseEntity <Optional<PancardDetails>>(details,HttpStatus.OK);
	}
}
