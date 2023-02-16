package com.study.exception;

public class DataAlreadyExistsException extends Exception{

	
	private static final long serialVersionUID = 1510486075922313318L;
	
	public DataAlreadyExistsException() {
		super( "Data already exists." );
	}
	
	
}
