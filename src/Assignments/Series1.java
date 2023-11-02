/*
 * 
 * Program to find sum of the series :  1 + 1/4 + 1/9 + 1/16 + ....... + 1/n^2
 * 
 */

package Assignments;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value  for n : ");
		int n=scn.nextInt();
		
		System.out.println("The Sum of the series : ");
		System.out.print("1/1*1");
		
		float sum=1;
		
		for(float i=2;i<=n;i++) {
			System.out.print(" + 1/"+i+"*"+i);
			//sum=(float) (sum+ (1/Math.pow(i, 2)));
			sum=sum+(1/(i*i));
		}
		System.out.printf(" = %.2f",sum);
		
		scn.close();
	}

}
