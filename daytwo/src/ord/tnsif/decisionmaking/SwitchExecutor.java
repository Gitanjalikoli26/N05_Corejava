//program to demonstrate the switch 
package ord.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno)
		{
			case 1:
				System.out.println("perfect");
				break;
			case 2:
				System.out.println("oo Antava");
				break;
			case 3:
				System.out.println("Taki taki");
				break;
			case 4:
				System.out.println("invalid input");
				break;
				
		}

	}

}
