package ControlFlowStatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int num;
		int remainder;
		int result=0;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=scn.nextInt();
		
		int n=num;
		
		while(n!=0) {
			remainder=n%10;
			result=(result*10)+remainder;
			n=n/10;
		}	
		
		if(num==result) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	
	}

}
