//Count no. of bits to One - (means Decimal to Binary)
package program;

import java.util.Scanner;

public class CountOne {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=scn.nextInt();
		
		String x="";
		int a;
		while(n>0) {
			a=n%2;
			x=x+a;
			n=n/2;
		}
		
		int l=x.length();
		int count=0;
		
		for(int i=0;i<l;i++) {
			if(x.charAt(i)=='1') {
				count++;
			}
		}
		
		System.out.println("No. of Ones = "+count);
		
		scn.close();
	}

}
