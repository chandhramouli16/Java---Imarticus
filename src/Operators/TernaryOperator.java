//Largest of three numbers
package Operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.print("Enter A : ");
		int a=scn.nextInt();
		System.out.print("Enter B : ");
		int b=scn.nextInt();
		System.out.print("Enter C : ");
		int c=scn.nextInt();
		
		int d= c>((a>b)? a : b)? c : ((a>b)?a:b);
		System.out.println(d);
		
		scn.close();
	}

}
