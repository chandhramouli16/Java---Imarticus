package Assesment3;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int flag=0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>=arr[j]) {
					flag=1;
				}
			}
		}
		
		if(flag==0) 
			System.out.println("Array is strictly increasing");
		else
			System.out.println("Array is not strictly increasing");
		
		scn.close();
		
	}

}
