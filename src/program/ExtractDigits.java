//Java program to extract digits from a given integer
package program;

import java.util.Scanner;

public class ExtractDigits {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scn.nextInt();
		
		int m=n;
		int counter=0;
		
		while(m>0) {
			m=m/10;
			counter++;
		}
		int a;
		while(n>0) {
			a=n%10;
			System.out.println("Digit at Posotion "+counter+" is : "+a);
			n=n/10;
			counter--;
		}
		
		scn.close();
	}

}
