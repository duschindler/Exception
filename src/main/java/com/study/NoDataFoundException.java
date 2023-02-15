package com.study;

public class NoDataFoundException extends Exception {


	private static final long serialVersionUID = -3957900344779527827L;

	public NoDataFoundException() {
		super( "There's no data found with these parameters." );
	}
	
}
