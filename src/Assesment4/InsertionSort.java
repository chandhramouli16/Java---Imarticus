package Assesment4;

import java.util.*;

public class InsertionSort {

public static void insertionSort(int[] a,int n) {
		
		int key;
		int temp;
		for(int step=1;step<n;step++) {
			key=step;
			for(int i=step-1;i>=0;i--) {
				if(a[i]>a[key]) {
					temp=a[i];
					a[i]=a[key];
					a[key]=temp;
					key--;
				}
			}
		}
		
	}

	public static void printArray(int[] a,int n) {
	
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	
	}

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=scn.nextInt();
		
		int a[]=new int[n];
		System.out.print("Input:");
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		
		insertionSort(a,n);
		System.out.print("Output:");
		printArray(a,n);
		
		scn.close();
	}

}
