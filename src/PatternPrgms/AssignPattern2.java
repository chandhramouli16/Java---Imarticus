package PatternPrgms;

import java.util.Scanner;

public class AssignPattern2 {

	public static void main(String[] args) {

		Scanner sn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=sn.nextInt();
				
		for(int i=1;i<=n;i++) {
			if(i<=n/2) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");				
				}
			}
			else {
				for(int j=n;j>=i;j--) {
					System.out.print("* ");				
				}
			}
			System.out.println();
		}
		
	}

}
