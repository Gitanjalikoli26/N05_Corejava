package org.tnsif.singledimentionalarray;
//program to demonstrate on array using compile time input values
public class ArrayExample {

	public static void main(String[] args) {
		//declaration an initialization of an array at compile time
		int arr[]= {44,55,2,32,28};
		System.out.println("The array of 2nd index is :"+arr[2]);
		//to print all the values of an array
		for(int i:arr)
		{
			System.out.print(i+" ");
			//System.out.println(i+" ");
		}

	}

}
