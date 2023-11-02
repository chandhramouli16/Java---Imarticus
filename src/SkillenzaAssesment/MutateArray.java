package SkillenzaAssesment;

import java.util.Scanner;

public class MutateArray {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter array elements one by one : ");
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]==0 && i>0 && i<n-1) {
				a[i]=a[i-1]+a[i]+a[i+1];
			}
			else if(a[i]==0 && i==0) {
				a[i]=a[i]+a[i+1];
			}
			else if(a[i]==0 && i==n-1) {
				a[i]=a[i-1]+a[i];
			}
		}
		
		System.out.println("Final Array : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		scn.close();
	}

}
