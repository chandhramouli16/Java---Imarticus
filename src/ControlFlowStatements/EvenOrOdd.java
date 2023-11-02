package ControlFlowStatements;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String args[]) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		num=s.nextInt();
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
