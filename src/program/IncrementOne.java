//Increment by 1 all digits of the given integer
package program;

import java.util.Scanner;

public class IncrementOne {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scn.nextInt();
		System.out.println("Number before Increment : "+n);
		String s="";
		int a;
		while(n>0) {
			a=n%10;
			a=a+1;
			s=a+s;
			n=n/10;
		}
		System.out.println("Number after Increment : "+s);
		
		scn.close();
		
	}

}

