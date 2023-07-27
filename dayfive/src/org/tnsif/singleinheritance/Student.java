//Derive class
package org.tnsif.singleinheritance;

public class Student extends Citizen{
	//private data member
	private int rollNo;
	private String collegeName;
	
	//default constructor
	public Student() {
		super();
		System.out.println("child class-Default constructor");
	}
	//parameterized constructor
	public Student(String city,int pincode,long aadharNo,long contactNo,int rollNo,String collegeName) {
		super(city,pincode,aadharNo,contactNo);
		this.rollNo=rollNo;
		this.collegeName=collegeName;;
		
		
		
		
	}
   //getter setter
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getCity()=" + getCity()
				+ ", toString()=" + super.toString() + "]";
	}
	

	
}
