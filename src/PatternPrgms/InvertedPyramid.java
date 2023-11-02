package PatternPrgms;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int space=1;space<i;space++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
