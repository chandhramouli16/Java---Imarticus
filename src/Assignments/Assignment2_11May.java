package Assignments;
import java.util.Scanner;
public class Assignment2_11May {

	public static void main(String[] args) {

		int month;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the month number : ");
		month=scn.nextInt();
		
		if(month==1||month==2||month==3||month==4) {
			System.out.println("Summer");
		}
		else if(month==5||month==6||month==7||month==8) {
			System.out.println("Rainy");
		}
		else if(month==9||month==10||month==11||month==12) {
			System.out.println("Winter");
		}
		else {
			System.out.println("Invalid Number");
		}
		
	}

}
