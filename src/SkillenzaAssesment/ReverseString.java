package SkillenzaAssesment;

import java.util.Scanner;

public class ReverseString {

	public static String reverseString(String str) {
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str=scn.nextLine();
		
		System.out.println("String in reverse : \n"+reverseString(str));
		
		scn.close();
	}
	
}
