package Assesment3;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int count=0;

		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		
		int[] arr1=new int[n];
		
		for(int i=0;i<count;i++) {
			arr1[i]=0;
		}
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr1[count]=arr[i];
				count++;
			}
		}
		
		System.out.println("Array after shifting zeroes : ");
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]+" ");
		}
		
		scn.close();
	}

}
