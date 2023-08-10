package org.tnsif.singledimentionalarray;
//driver class
//program to demonstrate on array of objects 
public class ArraysOfObjectDemo {

	public static void main(String[] args) {
		//Employee has different datatype thats why we use Employee objecr 
		Employee arr[]=new Employee[2];
		arr[0]=new Employee(101,"KOmal Chaudhary",44000.8);
		arr[1]=new Employee(102,"Rani Chaudhary",45000.8);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}

		

	}

}
