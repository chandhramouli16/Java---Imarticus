package Operators;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter A : ");
		a=scn.nextInt();

		System.out.println("Enter B : ");
		b=scn.nextInt();
		
		System.out.println("Enter C : ");
		c=scn.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		else if(b>a && b>c) {
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
		
		scn.close();
		
	}

}
