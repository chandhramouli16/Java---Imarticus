// 1,2,1,3,2,5,3,7,5,11,8,13,13,17,....
// Odd places - Fibonacci Series ----- Even places - Prime numbers
// Print only specified place
package Assignments;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nth in the series to print : ");
		int n=scn.nextInt();
		
		int arr[]=new int[n];
		
		int fib1=1;
		int fib2=1;
		int fib3;
		
		int num=2,j,n1=n/2;
		
		Outer:
		for(int i=0;i<n;i++) {
			if(i%2!=0){
				while(n1>0) {
					j=2;
					while(num%j!=0) {
						j++;
					}
					if(num==j) {
						arr[i]=num;
						//System.out.print(num+" ");
						num++;
						n1--;
						continue Outer;
					}
					else
						num++;
				}
			}
			else {
				arr[i]=fib1;
				//System.out.print(fib1+" ");
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
			}
		}
		
		System.out.println("The "+n+"th term in the series is "+arr[n-1]);
		
		scn.close();
	}

}
