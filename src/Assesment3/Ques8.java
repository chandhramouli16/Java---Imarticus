package Assesment3;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter order of the matrix : ");
		int order=scn.nextInt();
		
		int[][] a=new int[order][order];
		System.out.println("Enter elements of the Matrix : ");
		for(int i=0;i<order;i++) {
			for(int j=0;j<order;j++) {
				a[i][j]=scn.nextInt();
			}
		}
		
		System.out.println("Matrix : ");
		for(int i=0;i<order;i++) {
			for(int j=0;j<order;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int sum=0;
		int product=1;
		
		System.out.println("          Sum         Product ");
		for(int k=0;k<order;k++) {	
			for(int i=k;i<=k;i++) {
				for(int j=0;j<order;j++) {
					sum=sum+a[i][j];
					product=product*a[i][j];
				}
				System.out.println("Row "+(i+1)+"     "+sum+"           "+product);
				sum=0;
				product=1;
			}
			for(int j=k;j<=k;j++) {
				for(int i=0;i<order;i++) {
					sum=sum+a[i][j];
					product=product*a[i][j];
				}
				System.out.println("Column "+(j+1)+"  "+sum+"           "+product);
				sum=0;
				product=1;
			}
		}
		
		scn.close();
		
	}

}
