package com.study.exception;

public class NoDataFoundException extends Exception {


	private static final long serialVersionUID = -3957900344779527827L;

	public NoDataFoundException() {
		super( "No data found with these parameters." );
	}
	
}
