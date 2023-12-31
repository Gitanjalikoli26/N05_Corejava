//Base class
package org.tnsif.singleinheritance;

public class Citizen {
	//private
	private String city;
	private int pincode;
	private long aadharNo;
	private long contactNo;
	
	//parameterized constructor
	
	public Citizen() {
		System.out.println("Default constructor");
		
	}
	public Citizen(String city,int pincode,long aadharNo,long contactNo) {
		
		super();
		this.city=city;
		this.pincode=pincode;
		this.aadharNo=aadharNo;
		this.contactNo=contactNo;
		System.out.print("Parametrized constructor");
	}
	
	
	//getter setter for private specifier
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", aadharNo=" + aadharNo + ", contactNo=" + contactNo
				+ ", getCity()=" + getCity() + ", getPincode()=" + getPincode() + ", getAadharNo()=" + getAadharNo()
				+ ", getContactNo()=" + getContactNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
