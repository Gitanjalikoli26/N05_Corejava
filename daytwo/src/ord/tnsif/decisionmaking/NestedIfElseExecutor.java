//program to demonstrate on Nested if..else
package ord.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("Person is eligible to bunjee jumping");
				if(weight>110)
				{
					System.out.print("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not eligible");
			}
		}
		 else 
			 
		{
			System.out.println("Not eligible");
			
		}
		}

	}


