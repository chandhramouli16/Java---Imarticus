package PatternPrgms;

import java.util.Scanner;

public class AssignPattern4 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i<=n/2) {
				for(int space=1;space<i;space++) {
					System.out.print(" ");
				}
				for(int j=n/2+1;j>=i;j--) {
					System.out.print("* ");
				}
			}
			else {
				for(int space=n;space>i;space--) {
					System.out.print(" ");
				}
				for(int j=n/2;j<i;j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

}
