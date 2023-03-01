package com.study.exception;

public class UserRoleException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -519238582059377211L;

	public UserRoleException() {
		super( "The role of the user's action don't permit it." );
	}
	
}
