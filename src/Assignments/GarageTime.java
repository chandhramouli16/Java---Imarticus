package Assignments;
import java.util.Scanner;
public class GarageTime {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter num of cars in garage : ");
		int n=scn.nextInt();
		
		System.out.println("Enter time interval of each car to arrive : ");
		int x=scn.nextInt();
		
		int last=n-1;
		
		int time=last*x;
		
		System.out.println(time);
		
	}

}
