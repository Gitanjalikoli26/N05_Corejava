//Program to demonstrate the problem 
package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the value of num");
		int num=s.nextInt();
		System.out.print("The value of num is:"+num);
		System.out.print("Enter the value of floatnum");
		float num1=s.nextFloat();
		System.out.print("The value of floatnum is:"+num1);
		
		System.out.print("Enter the value of char");
		char c=s.next().charAt(0);
		System.out.print("Character is :"+c);
		
		System.out.print("Enter the value of string");
		String str1=s.nextLine();
		//s.next();
		System.out.println("String is:"+str1);
	}

}
