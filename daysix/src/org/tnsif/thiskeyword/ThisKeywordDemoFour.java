package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	//default constructor
	int x;
	ThisKeywordDemoFour()
	{
		this(34);
		System.out.println("Default Constructor");
	}
	ThisKeywordDemoFour(int x)
	{
		this.x=x;
		System.out.println("Parameterized Constructor:"+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoFour f=new ThisKeywordDemoFour();

	}

}

