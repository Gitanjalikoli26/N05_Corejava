//program to demonstrate the do while loop
package org.tnsif.looping;

import java.util.Scanner;

public class DoWhileExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		do{
			System.out.print("Value of n is:"+n);
			n++;
		}while(n<14);
		

	}

}
