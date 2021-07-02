package com.company.rest.works.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class DuplicateUserException extends Exception {

	private static final long serialVersionUID = 1L;

	private String msg;
	
	public DuplicateUserException() {
		msg = "User already registered with given ID."; 
	}

	public DuplicateUserException(String msg) {
		this.msg  = msg; 
	}

	@Override
	public String getMessage() {
		return this.msg; 
	}
}