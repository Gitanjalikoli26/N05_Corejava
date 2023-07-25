/* Program to demonstrate on default and parameterized Constructor*/
package org.tnsif.classobjects;

public class Citizen {
	//data members
	String citizenTYpe;
	long aadharNo;
	String gender;
	String city;
	
	//default constructor
	public Citizen()
	{
		System.out.print("Demonstration on default constructor");
	}
    //parameterized constructor
	public Citizen(String citizenTYpe, long aadharNo, String gender, String city) {
		super();
		this.citizenTYpe = citizenTYpe;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Citizen [citizenTYpe=" + citizenTYpe + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
   
}
