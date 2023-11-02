package ControlFlowStatements;
import java.util.Scanner;
public class PositiveNegative {
	public static void main(String args[]) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		num=s.nextInt();
		if(num>0) {
			System.out.println("Positive Number");
		}
		else if(num==0) {
			System.out.println("The Number is Zero");
		}
		else {
			System.out.println("Negative Number");
		}
	}

}
