package ControlFlowStatements;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		int num;
		int remainder;
		int result=0;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=scn.nextInt();
		
		while(num!=0) {
			remainder=num%10;
			result=(result*10)+remainder;
			num=num/10;
		}
		
		System.out.print(result);
		scn.close();
		
	}

}
