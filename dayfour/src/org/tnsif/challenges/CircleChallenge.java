package org.tnsif.challenges;

import java.util.Scanner;

/* There are n people standing in a circle waiting to be executed .
 * The counting out begins at some point in the circle and proxits around the circle in a fix direction .
 * In each step a certain no. of people are skip and the next person is executed .
 * The elimination proxits around the circle(Which is becoming smaller and smaller as the executed people are removed),
 * until only the last person remains who is given freedom.
 * Given the total no. of person n and no.k which indicate that k-1 person are skipped.
 * And the k'th person is killed in a circle .
 * The task is to choose the person in the initial circle that's survive.
 * n=10 k=2 k=k-1(2-1=1)  */
public class CircleChallenge {
	static int survive(int n,int k)
	{
		
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)&n+1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));

	}

}
