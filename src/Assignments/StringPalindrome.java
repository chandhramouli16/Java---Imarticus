package Assignments;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		
		String reverse=new StringBuffer(str).reverse().toString();
		boolean s=str.equalsIgnoreCase(reverse);
		
		if(s==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
		scn.close();
	}

}
