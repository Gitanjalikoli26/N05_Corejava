/*Ask the customer age and for the time on a 24 hour clock(where noon is 12.00 and 4.30 is 16.30)
 * show timings are 10.15,13.30,18.00 and 22.00.The normal adults ticket price is $8.00,
 * however the adult matinee price is $5.00.Adults are those over 13 
 * years.The normal children ticket price is $4.00,however the children's*/
package org.tnsif.challenges;

import java.util.Scanner;

public class MovieTicket {
	
	static void ticket(int age,float st)
	{
		//adults
		if(age>13)
		{
			if(st>=13.30 && st<=17.59)
				System.out.println("$5.00");
			else
				System.out.println("$8.00");
		}
		else
			if(st>=13.30&& st<=17.59)
				System.out.println("$2.00");
			else
				System.out.println("$4.00");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		float st=s.nextFloat();
		ticket(age,st);
		
		

	}

}
