package com.study.exception;

public class UserNotActiveException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 751602289283454661L;

	public UserNotActiveException() {
		super( "The user is not active." );
	}
	
}
