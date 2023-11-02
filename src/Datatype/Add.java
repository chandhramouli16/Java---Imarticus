package Datatype;
import java.util.Scanner;
public class Add {
	public static void main(String args[]) {
		int num1; //Declaration 
		int num2;
		int result;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1=s.nextInt();
		System.out.print("Enter second number: ");
		num2=s.nextInt();
		result=num1+num2;
		System.out.println("Adding two numbers: " + result);//Concatenation
		
	}
}
