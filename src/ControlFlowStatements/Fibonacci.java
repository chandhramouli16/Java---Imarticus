//0,1,1,2,3,5,8,13,21,34,55,89......
package ControlFlowStatements;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		
		int num;
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the number : ");
		num=scn.nextInt();
		
		int f1=0;
		int f2=1;
		int f3;
		
		System.out.print(f1+","+f2);
		
		for(int i=3;i<=num;i++) {
			f3=f2+f1;
			System.out.print(","+f3);
			f1=f2;
			f2=f3;
		}
			
	}
	
}
