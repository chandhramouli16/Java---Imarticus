package Assignments;

import java.util.Scanner;

public class BitPosition {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the decimal : ");
		int n=scn.nextInt();
		
		String str="";
		int num;
		while(n>0) {
			num=n%2;
			str=num+str;
			n=n/2;
		}
		//System.out.println(str);
		char[] ch=str.toCharArray();
		System.out.println("Enter the position you want to check : ");
		int pos=scn.nextInt();
		if(ch[pos-1]=='1') {
			System.out.println("1 is present in the given position.");
		}
		else {
			System.out.println("0 is present in the given position.");
		}
		
		scn.close();
	}

}
