package com.petercai.springrest.errorresponse;

public class StudentErrorResponse extends ErrorResponse{

	public StudentErrorResponse() {
		super();
	}

	public StudentErrorResponse(int status, String message, long timestamp) {
		super(status, message, timestamp);
	}
	
}
