//program to demonstrate on encapsulation
/*Encapsulation achieves the data hiding using private 
 * access specifier*/
package org.insif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h=new HDFC();
		h.setAccountNo(2345567554322L);
		h.setAccountType("current Account");
		h.setCvvNo(233);
		h.setPinNo(1221);
		
		/*
		System.out.print(h.getAccountNo());
		System.out.print(h.getAccountType());
		System.out.print(h.getCvvNo());
		System.out.print(h.getPinNo());
		*/
		System.out.println(h);

	}

}
