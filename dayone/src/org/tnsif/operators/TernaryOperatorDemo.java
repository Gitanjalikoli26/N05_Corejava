//program to demonstrate the Ternary Operators
package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         int num=s.nextInt();
         String res=(num%2==0)?"Even":"odd";
         System.out.println("Result is:"+res);
         s.close();
         
	}

}
