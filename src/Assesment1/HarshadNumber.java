package Assesment1;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int N=scn.nextInt();
		int num=N;
		int rem=0;
		while(N>0) {
			rem=rem+(N%10);
			N=N/10;
		}
		
		if(num%rem==0) {
			System.out.println("Harshad Number");
		}
		else
			System.out.println("Not a Harshad Number");
		
		scn.close();
	}

}
