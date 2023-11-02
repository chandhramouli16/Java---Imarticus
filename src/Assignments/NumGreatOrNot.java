package Assignments;

import java.util.Scanner;

public class NumGreatOrNot {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scn.nextInt();
		int num=n;

		int rem=0;
		int m=0;
		int j=1;
		while(n!=0) {
			
			rem=n%10;
			m=m+rem;
			j=j*rem;
			n=n/10;
			
		}
		
		if(num==m+j) {
			System.out.println("Great");
		}
		else {
			System.out.println("Not Great");
		}
		
	}

}
