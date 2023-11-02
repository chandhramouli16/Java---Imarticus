package Assignments;
import java.util.Scanner;
public class Assignment1_10May {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius;
		double area;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter radius of the circle : ");
		radius=scn.nextInt();
		area=3.14*radius*radius;
		System.out.printf("Area of the Circle is : %.2f",area);
	}

}
