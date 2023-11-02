package ArrayPractice;

import java.util.Scanner;

public class DeleteElement {
	
	public static void printArray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
	}
	
	public static void deleteElement(int[] a,int n,int ele) {
		int index=0;
		for(int i=0;i<n;i++) {
			if(a[i]==ele) {
				index=i;
			}
		}
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
		
		System.out.println("Enter the element to delete : ");
		int delEle=scn.nextInt();
		
		deleteElement(arr,n,delEle);
		
		System.out.println("Array after deletion : ");
		printArray(arr,n-1);
		
		scn.close();
	}

}
