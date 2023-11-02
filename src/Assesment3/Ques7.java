package Assesment3;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int[] arr1=new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i]=arr[i];
		}
		
		int temp=0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int m=n-1;
		int max=arr[m];
		
		System.out.println("Initial array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<n-1;i++) {
			if(arr1[i]==max) {
				m--;
				max=arr[m];
				arr1[i]=max;
			}
			else if(arr1[i]<max) {
				arr1[i]=max;
			}
		}
		arr1[n-1]=0;
		
		System.out.println("Final array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		scn.close();
	}

}
