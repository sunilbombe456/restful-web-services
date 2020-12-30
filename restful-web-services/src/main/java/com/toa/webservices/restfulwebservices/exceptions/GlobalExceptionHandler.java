package com.toa.webservices.restfulwebservices.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.toa.webservices.restfulwebservices.entity.ResponseError;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler()
	public ResponseEntity<?> handleException(Exception exe) {
		ResponseError error = new ResponseError();
		error.setDate(new Date());
		error.setMessage(exe.getMessage());
		error.setDetails(exe.getLocalizedMessage().toString());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

}
