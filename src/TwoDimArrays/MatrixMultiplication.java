package TwoDimArrays;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int r1=2;
		int c1=3;
		int r2=3;
		int c2=2;
		
		int[][] a= {{3,-2,5},{3,0,4}};
		int[][] b= {{2,3},{-9,0},{0,4}};
		
		int product[][]=new int[r1][c2];
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++) {
					product[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("Product of the Matrices are :");
		for(int[] row:product) {
			for(int column:row) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
		
	}

}
