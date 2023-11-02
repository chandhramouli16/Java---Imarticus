package Assesment3;

import java.util.Scanner;

public class Ques9 {

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
		
		int oddCount=0;
		int evenCount=0;
		
		for(int i=0;i<order;i++) {
			for(int j=0;j<order;j++) {
				if(a[i][j]%2==0)
					evenCount++;
				else
					oddCount++;
			}
		}
		
		System.out.println("Even number frequency : "+evenCount);
		System.out.println("Odd number frequency : "+oddCount);
		
		scn.close();		
	}

}
