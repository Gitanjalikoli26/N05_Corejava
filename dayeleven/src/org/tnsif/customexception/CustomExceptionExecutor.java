package org.tnsif.customexception;

import java.util.Scanner;

//program to demonstrate on user defined exception
//driver class
public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCredentials {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an email and password:");
		String email=s.nextLine();
		String password=s.nextLine();
		try
		{
		     if(email.equals("skumbhalkar@tnsif.org")&& password.equals("pass@123"))
		           {   
		    	             System.out.println("Credential matched");
			
		          }
		else
		{
			throw new LoginCredentials("Invalid Credential");
		}
		
		
	}
   catch(LoginCredentials e)
   {
	   System.out.println(e);
   }
}
}
