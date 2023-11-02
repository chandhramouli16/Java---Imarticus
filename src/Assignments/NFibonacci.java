package Assignments;

import java.util.Scanner;

public class NFibonacci {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=scn.nextInt();
		int fib1=0;
		int fib2=1;
		int fib3;
		
		System.out.println("Printing N numbers of fibonacci series : ");
		for(int i=0;i<n;i++) {
			System.out.print(fib1+" ");
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
		}
		
		scn.close();
	}

}
