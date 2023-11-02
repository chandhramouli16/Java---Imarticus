package Operators;

import java.util.Scanner;

public class MiscallaneousOp {

	public static void main(String[] args) {

		int num;
		String result;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=s.nextInt();
		result=(num%2==0)?"Even number":"Odd number";
		System.out.println(result);
		s.close();//to close the scanner
		
	}

}
