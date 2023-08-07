package org.tnsif.interfacedemo;

public interface DebitCard {
	/*by default all the variable inside an interface is public
	 * static final and if it final then we must have to initialize 
	 * value for the variable*/
	long cardno=45678943L;
	//we can't use concrete method inside the interface 
	//by default method inside an abstract 
	void displayCardDetails();
	/*default method and static method is the new features of java 8
	 * which can we use inside an interface */
	default void display()
	{
		System.out.println("Default Method");
		
	}
	//static method
	static void print()
	{ 
		System.out.println("Static Method");
		
	}
	
}
