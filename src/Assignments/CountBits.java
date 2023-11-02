
package Assignments;

import java.util.Scanner;

public class CountBits {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=scn.nextInt();
		
		int count=0;
		while(n>0) {
			if(n%2==1)
				count++;
			n=n/2;
		}
		
		System.out.println("No. of Ones = "+count);
		
		scn.close();
	}

}
