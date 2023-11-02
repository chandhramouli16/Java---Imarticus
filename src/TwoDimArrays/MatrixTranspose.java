package TwoDimArrays;

public class MatrixTranspose {

	public static void main(String[] args) {

		int row=2;
		int column=3;
		int[][] matrix= {{2,3,4},{5,6,7}};
		
		display(matrix);
		
		int[][] transpose=new int[column][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				transpose[j][i]=matrix[i][j];
			}
		}
		display(transpose);
		for(int[] r:transpose) {
			for(int c:r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void display(int[][] matrix) {
		
		System.out.println("Matrix : ");
		for(int[] r:matrix) {
			for(int c:r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
	}

}
