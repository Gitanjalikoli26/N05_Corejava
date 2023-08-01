//program to demonstrate to access specifier
package org.tnsif.accessspecifier;

public class Bank {
	
	//Different access Specifier
	public String bankName;
	private int pinNo;
	long accountNo=4455667788334422L;
	
	public void displayPublic()
	{
		System.out.print("Bank name is:" +bankName);
	}
	private void displayPrivate()
	{
		System.out.print("pin No. is:"+pinNo);
	}
	void displayDefault()
	{
		System.out.print("Account No. is :" +accountNo);
	}
	

}
