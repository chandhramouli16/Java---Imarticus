package ControlFlowStatements;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		int num;
		int fact=1;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=scn.nextInt();
		
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		
		System.out.print("Factorial of "+num+" = "+fact);
		scn.close();
	}

}
