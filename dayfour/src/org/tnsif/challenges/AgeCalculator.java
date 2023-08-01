/*Asks a user for that their birth year encoded as two digit (like "62")and for the current year ,
 * also encoded as two digit(like"99")
 * write a program to find the user current age in years 
 * */
package org.tnsif.challenges;

import java.util.Scanner;

public class AgeCalculator {
	static void ageCalculator(int by,int cy)
	{
		if(cy>by)
		{
			System.out.println(cy-by);
		}
		else
		{
			System.out.println((100-by)+cy);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the birth year and current year:");
		int by=s.nextInt();
		int cy=s.nextInt();
		ageCalculator(by,cy);

	}

}
