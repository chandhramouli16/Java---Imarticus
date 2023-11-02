/* 
 *  123
 *  045
 *  006
 */
package TwoDimArrays;

import java.util.Scanner;

public class UpperTriangularmatrix {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int rows=scn.nextInt();
		System.out.println("Enter no. of columns : ");
		int columns=scn.nextInt();
		
		if(rows==columns) {
			
			int[][] a=new int[rows][columns];
			System.out.println("Enter elements of the Matrix : ");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					a[i][j]=scn.nextInt();
				}
			}
		
			int count=0;
			for(int i=1;i<rows;i++) {
				for(int j=0;j<i;j++) {
					if(a[i][j]!=0)
						count=1;
				}
			}
			if(count ==1) {
				System.out.println("It is not an upper triangular matrix");
			}
			else {
				System.out.println("It is an upper triangular matrix");
			}
			
		}
		else {
			
			System.out.println("No. of rows and columns are not equal");
		
		}
		
	}

}
