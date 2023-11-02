package Assignments;

import java.util.Scanner;

public class NPrime {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=scn.nextInt();
		
		System.out.println("Printing N Prime numbers : ");
		int num=2,i;
		while(n>0) {
			i=2;
			while(num%i!=0) {
				i++;
			}
			if(num==i) {
				System.out.print(num+" ");
				num++;
				n--;
			}
			else
				num++;
		}
		
		scn.close();
	}

}
