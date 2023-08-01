//Pratik is so much interested in gardening  and hence he plant more tree in garden 
//he plant tree in a rectangular fashion with the order of rows and columns and numbers the tree in rows wise order.
//he planted the mango tree only in the first row first column and last columns
//so,given the tree No. and rows and columns your task is to find out whether the given tree is mango tree or not
//input n=5
//t=11(tree No.)



package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
	
	
     
	static void isMangoTree(int n,int t)
	{
		if(t%n==0 || t%n==1 ||t<=n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a mango Tree");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n and t:");
        int n=s.nextInt();
        int t=s.nextInt();
        isMangoTree(n,t);
	}

}
