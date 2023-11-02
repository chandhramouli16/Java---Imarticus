package Assignments;

import java.util.Scanner;

public class Assignment2_10May {

	public static void main(String[] args) {
		float radius;
		double circumference;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter radius of the circle : ");
		radius=scn.nextInt();
		circumference=2*3.14*radius;
		System.out.printf("Circumference of the circle : %.2f",circumference);
	}

}
