package com.deloitte.pandetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PancardExceptionHandler {
	@ExceptionHandler(value = PancardNotAvailableException.class)
	public ResponseEntity<Object> exception(PancardNotAvailableException ex)
	{
		return new ResponseEntity<Object>("Pancard with entered number is not available!!",HttpStatus.NOT_FOUND);
	}

}
