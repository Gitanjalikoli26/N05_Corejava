//program to demonstrate the while loop
package org.tnsif.looping;

import java.util.Scanner;

public class WhileExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(n>=i)
		{
			System.out.print(n+" ");
			n--;
			
		}

	}

}
