//program to demonstrate on Check exception
package org.tnsif.checkexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\kolig\\Downloads\\tnsif.txt");
			System.out.println("File has Found");
		} catch (FileNotFoundException e) {
		 System.out.println("File is not exist:"+e);
		}

	}

}
