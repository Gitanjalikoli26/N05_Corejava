package org.tnsif.customexception;

import java.util.Arrays;

//program to demonstrate on user defined exception
public class LoginCredentials extends Exception {
	
	
	//private data member
	
	private String str;

	//getter setter
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	
	//to string 
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}

	
	

}
