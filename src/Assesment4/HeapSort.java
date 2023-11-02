package Assesment4;

import java.util.Scanner;

public class HeapSort {
	
	static void printArray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void heapSort(int[] a,int n) {
		int maxIndex;
		int temp;
		for(int step=0;step<n-1;step++) {
			maxIndex=step;
			for(int i=n-1;i>=step;i--) {
				if(a[maxIndex]>a[i]) {
					maxIndex=i;
				}
			}
			temp=a[maxIndex];
			a[maxIndex]=a[step];
			a[step]=temp;
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
		
		heapSort(a,n);
		System.out.print("Output:");
		printArray(a,n);
		
		scn.close();
	}

}
