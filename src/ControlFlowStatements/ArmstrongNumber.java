package ControlFlowStatements;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {

		int num;
		int count=0;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=scn.nextInt();//Input: 153,1634,1,2,3,4,5,6,7,8,9,370,371,54748
		
		int n=num;
		
		while(n!=0) {
			count++;
			n=n/10;
		}

		n=num;
		int rem;
		int result=0;
		
		while(n!=0) {
			rem=n%10;
			result=(int) (result+Math.pow(rem,count));
			n=n/10;
			}
		
		if(num==result) {
			System.out.println("It is an Armstrong number");
		}
		else {
			System.out.println("It is not an Armstrong number");
		}
				
	}

}
