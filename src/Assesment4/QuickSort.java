package Assesment4;

import java.util.*;

public class QuickSort {

	static void printArray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	static void quickSort(int[] a,int low,int high) {
		
		if(low<high) {
			int pivot=partition(a,low,high);
			
			quickSort(a,low,pivot-1);
			
			quickSort(a,pivot+1,high);
		}
		
	}
	
	static int partition(int[] a,int low,int high) {

		int pivot=a[high];
		int i=low;
		int temp;
		
		for(int j=low;j<high;j++) {
			if(a[j]<=pivot) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
		}
		temp=a[i];
		a[i]=a[high];
		a[high]=temp;
		
		return (i);
		
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
		
		quickSort(a,0,n-1);
		System.out.print("Output:");
		printArray(a,n);
		
		scn.close();
	}

}

