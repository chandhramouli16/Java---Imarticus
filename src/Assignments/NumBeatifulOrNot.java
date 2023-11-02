package Assignments;

import java.util.Scanner;

public class NumBeatifulOrNot {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of elements in the array : ");
		int n=scn.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		
		if(sum%2==0 && sum%3==0 && sum%5==0) 
			System.out.println(1);
		else
			System.out.println(0);
		
		
	}

}
