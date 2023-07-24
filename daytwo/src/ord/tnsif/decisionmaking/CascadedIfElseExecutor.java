//Program to demonstrate on cascaded if...else
package ord.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age1=s.nextInt();
		int age2=s.nextInt();
		int age3=s.nextInt();
		if(age1>age2 && age1>age3)
		{ 
			System.out.println("Age1 is greater:"+age1);
			
		}
		else if(age2>age1 && age2>age3)
		{
			System.out.println("Age2 is greater:"+age2);
		}
		else if(age3>age1 && age3>age2)
		{
			System.out.println("Age3 is greater:"+age3);
		}
	}

}
