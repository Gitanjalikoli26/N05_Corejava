package org.tnsif.interfacedemo;

/*Functional Interface:
 * An interface which contain exactly one abstract 
 * method then the interface is known as function 
 * interface */
 
/* below annotation ensures that we have to use 
 * exactly one abstract method inside the interface*/
@FunctionalInterface
public interface popCorn {
	//abstract method
	void displayReceipe();
	
	

}
