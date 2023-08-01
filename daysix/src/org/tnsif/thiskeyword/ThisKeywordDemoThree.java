package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {
	 void print(ThisKeywordDemoThree t)
     {
     	System.out.println("Hey there, I am using 'this'"+ "keyword");
     }
     void display()
     {
    	 /*when you call any parameterized method inside
    	  * non-parameterized method then we get an error,
    	  * to overcome that we have to use this keyword as an argument
    	  * in the method call*/
     	print(this);
     	
     }

	public static void main(String[] args) {
		
		ThisKeywordDemoThree s=new ThisKeywordDemoThree();
		s.display();
		
       
	}

}