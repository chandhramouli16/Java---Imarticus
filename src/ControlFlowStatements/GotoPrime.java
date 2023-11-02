package ControlFlowStatements;

import java.util.Scanner;

public class GotoPrime {

	static int number=2,count;
	static int isPrime(int number1) {
		for(int j=2;j<=number1/2;j++) {
			if(number1%j==0) {
				number1++;
				isPrime(number1);
			}
		}
		if(count==0) {
			System.out.println(number1+" ");
			count++;
		}
		return number1;
	}
	
	static void primeNumber(int num) {
		count=0;
		if(num==0)
			return;
		else {
			if(number==2) {
				System.out.println(number+" ");
				number++;
			}
			else {
				number=isPrime(number);
				number++;
			}
		}
		primeNumber(--num);
	}
	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=scn.nextInt();
		
		System.out.println("Printing N Prime numbers : ");
		primeNumber(n);
		
		scn.close();
	}

}
