package com.petercai.springrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.petercai.springrest.errorresponse.StudentErrorResponse;

@ControllerAdvice
public class StudentRestExceptionHandler {
	
	// Add an exception handler
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleNotFound(StudentNotFoundException exp){
		
		StudentErrorResponse errorResponse = new StudentErrorResponse();
		errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		errorResponse.setMessage(exp.getMessage());
		errorResponse.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
	
	//General exception hander to catch any ...
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleGeneral(Exception exp) {
		
		StudentErrorResponse errorResponse = new StudentErrorResponse();
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		errorResponse.setMessage(exp.getMessage());
		errorResponse.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
}
