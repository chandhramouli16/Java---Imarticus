package ArrayPractice;

import java.util.Scanner;

public class DuplicatesRemoval {
	public static void printArray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
	}
	
	public static void deleteElement(int[] a,int n,int index) {
		while(index+1<n) {
			a[index]=a[index+1];
			index++;
		}
	}
	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Original Array : ");
		printArray(arr,n);
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					deleteElement(arr,n,j);
					j--;
					n--;
				}
			}
		}
		
		System.out.println("Array after deletion : ");
		printArray(arr,n);
		
		scn.close();
	}
}
