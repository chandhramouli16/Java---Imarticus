package PatternPrgms;

import java.util.Scanner;

public class AssignPattern6 {

	public static void main(String[] args) {

		int i,n,j,space;
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the no of lines : ");
		n=x.nextInt();
		for( i=1;i<=n;i++) {
			if(i<n/2) {
				for(space=1;space<i;space++) {
					System.out.print(" ");
				}
				for(j=n/2;j>=i;j--){  
					System.out.print("*");
				}
			}
			else {
				for(space=n/2;space>i;space--) {
					System.out.print(" ");
				}
				for(j=1;j<=i;j++) {     
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
