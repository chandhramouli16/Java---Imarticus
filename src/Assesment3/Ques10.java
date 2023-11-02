package Assesment3;

import java.util.Scanner;

public class Ques10 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter no. of rows in matrix A : ");
		int rowsA=scn.nextInt();
		System.out.println("Enter no. of columns in matrix A : ");
		int columnsA=scn.nextInt();
		
		int[][] a=new int[rowsA][columnsA];
		
		System.out.println("Enter no. of rows in matrix B : ");
		int rowsB=scn.nextInt();
		System.out.println("Enter no. of columns in matrix B : ");
		int columnsB=scn.nextInt();
		
		int[][] b=new int[rowsB][columnsB];
		
		System.out.println("Enter elements of the Matrix A : ");
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<columnsA;j++) {
				a[i][j]=scn.nextInt();
			}
		}
		
		System.out.println("Enter elements of the Matrix B : ");
		for(int i=0;i<rowsB;i++) {
			for(int j=0;j<columnsB;j++) {
				b[i][j]=scn.nextInt();
			}
		}
		
		System.out.println("Elements of Matrix A : ");
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<columnsA;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Elements of Matrix B : ");
		for(int i=0;i<rowsB;i++) {
			for(int j=0;j<columnsB;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] result=new int[rowsA][columnsA];
		
		System.out.println("Addition of Two Matrices : ");
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<columnsA;j++) {
				result[i][j]=(a[i][j] + b[i][j]);
				System.out.print( result[i][j] +" ");
			}
			System.out.println();
		}
		
		scn.close();
	}

}
