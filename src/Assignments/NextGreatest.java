package Assignments;

import java.util.Scanner;

public class NextGreatest {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of elements in the array : ");
		int n=scn.nextInt();
		
		int[] a=new int[n];
	
		System.out.println("Enter array elements one by one : ");
		for(int i=0;i<n;i++) 
			a[i]=scn.nextInt();
		
		int flag=0;
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				System.out.println(a[i]+" -> -1");
				flag=1;
			}
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					System.out.println(a[i]+" -> "+a[j]);
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(a[i]+" -> -1");
			flag=0;
		}
		
		scn.close();		
	}

}
