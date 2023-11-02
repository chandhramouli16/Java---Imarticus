package Assignments;

import java.util.Scanner;

public class DiffBetSmallLargeIndex {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of elements in the array : ");
		int n=scn.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int smallest=arr[0];
		int largest=arr[0];
		int smallIndex=0;
		int largeIndex=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<smallest) {
				smallIndex=i;
				smallest=arr[i];
			}
			if(arr[i]>largest) {
				largeIndex=i;
				largest=arr[i];
			}
				
		}
		System.out.println(largeIndex-smallIndex);
		
	}

}
