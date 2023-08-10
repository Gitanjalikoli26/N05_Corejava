package org.tnsif.singledimentionalarray;
//program to demonstrate on runtime array and to find out the largest element in an array

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the NO. of element in array:");
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		//array initialization
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the no.of elements in array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
        	if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        }
        
        
        System.out.println("The largest element en an array:"+max);
        //array is a class and sort is the built in method
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
