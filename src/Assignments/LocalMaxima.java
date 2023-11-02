package Assignments;

import java.util.Scanner;

public class LocalMaxima {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int localMaxima=arr[0];
		
		for(int i=0;i<n;i++) {
			if(i==0) {
				if(arr[i]>arr[i+1]) {
					localMaxima=arr[i];
					break;
				}
			}
			else if(i==n-1) {
				if(arr[i]>arr[i-1]) {
					localMaxima=arr[i];
					break;
				}
			}
			else {
				if((arr[i]>arr[i-1]) && (arr[i]>arr[i+1])) {
					localMaxima=arr[i];
					break;
				}
			}
		}
		
		System.out.println("Local Maxima of the array : "+localMaxima);
		
		scn.close();		
	}

}
