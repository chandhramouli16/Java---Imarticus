package PatternPrgms;

import java.util.Scanner;

public class AssignPattern3 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if( (i%2!=0 && j%2!=0 )||(i%2==0 && j%2==0)) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		
	}

}
