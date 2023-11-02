package Assesment3;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n]; 
		
		System.out.println("Enter all elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Enter the position at which you want to check number : ");
		int index=scn.nextInt();
		
		System.out.println("Number found at position "+index+" is : "+arr[index-1]);
		
		scn.close();
		
	}

}
