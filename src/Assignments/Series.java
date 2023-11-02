/*
 * 
 * Program to find sum of the series :  1 + 1/1! + 1/2! + 1/3! + ....... + 1/n!
 * 
 */

package Assignments;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value  for n : ");
		int n=scn.nextInt();
		
		System.out.println("The Sum of the series : ");
		System.out.print("1");
		
		float sum=1;
		float fact;
		
		for(int i=1;i<=n;i++) {
			System.out.print(" + 1/"+i+"!");
			fact=1;
			for(int j=i;j>0;j--) {
				fact=fact*j;
			}
			sum=sum+ (1/fact);
		}
		System.out.print(" = "+sum);
		
		scn.close();
	}

}
