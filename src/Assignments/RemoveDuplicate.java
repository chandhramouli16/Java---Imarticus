package Assignments;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scn.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter array elements in sorted order");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					int index=j;
					while((index+1)<n) {
						arr[index]=arr[index+1];
						index++;
					}
					j--;
					n--;
				}
			}
		}
		
		System.out.println("Array after removing duplicates");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		scn.close();
	}
	
}
