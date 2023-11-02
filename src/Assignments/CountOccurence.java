package Assignments;

import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scn.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter array elements in sorted order");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Enter the element to count occurence");
		int num=scn.nextInt();
		int count=0;
		
		for(int i=0;i<n;i++) {
			if(num==arr[i])
				count++;
		}
		
		System.out.println("Number of occurences of the element : "+count);

		scn.close();
	}

}
