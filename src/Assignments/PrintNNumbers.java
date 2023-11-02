package Assignments;

import java.util.Scanner;

public class PrintNNumbers {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=scn.nextInt();
		System.out.println("Printing N numbers : ");
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		
		scn.close();
	}

}
