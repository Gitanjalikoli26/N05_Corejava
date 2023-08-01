package org.tnsif.statickeyword;

public class StaticMethod {
	
	int x=2;
	static String collegename="MET";
	/*if any method outside the main function and if you want to 
	 * access that method inside main function we have to make 
	 * that method as static*/
	
	//static Method
	public static void print()
	{
		
		System.out.println(collegename);
		/* we can't use non static variable inside any static method*/
		//System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}
