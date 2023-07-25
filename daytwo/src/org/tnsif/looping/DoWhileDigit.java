package org.tnsif.looping;

public class DoWhileDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,n=0006546;
		do{
			n/=10;
			count++;
			
		}
		while(n !=0);
		{
			
		
		System.out.print("Number of digit is:" + count);
		}
	}
}
