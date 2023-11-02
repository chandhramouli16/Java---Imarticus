package ControlFlowStatements;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {

		int num;
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the number : ");
		num=scn.nextInt();
		
		int notPrime=0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				notPrime=1;
				break;
			}
		}
		
		if(notPrime==0)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
		
	}

}
