package SkillenzaAssesment;

import java.util.Scanner;

public class SumDigitsString {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str=scn.nextLine();
		
		int sum=0;
		int b;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				b=Integer.parseInt(String.valueOf(str.charAt(i)));
				sum=sum+b;
			}
		}
		
		System.out.println("Sum of the digits in the String = "+sum);
		
		scn.close();
	}

}
