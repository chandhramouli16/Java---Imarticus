package Assignments;

import java.util.Scanner;

public class SecLarSma {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int temp;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=n-1;i>0;i--) {
			if(arr[i]!=arr[i-1]) {
				System.out.println("Second Largest element in the array : "+arr[i-1]);
				break;
			}
		}
		
		
		System.out.println("Smallest element in the array : "+arr[0]);
		
		scn.close();
	}

}
