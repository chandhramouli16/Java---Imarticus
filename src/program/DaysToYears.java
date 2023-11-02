//Convert days to years, weeks, days
package program;

import java.util.Scanner;

public class DaysToYears {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter days : ");
		int d=scn.nextInt();
		int years;
		int weeks;
		int days;
		
		years=d/365;
		d=d%365;
		weeks=d/7;
		days=d%7;
		
		System.out.println(years+" Years "+weeks+" Weeks "+days+" days ");
		
		scn.close();
	}

}
