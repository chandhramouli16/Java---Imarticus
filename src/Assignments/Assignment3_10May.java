package Assignments;

import java.util.Scanner;

public class Assignment3_10May {

	public static void main(String[] args) {
		int stuId;
		String stuName;
		int mark1;
		int mark2;
		int mark3;
		int total;
		float avg;
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Roll No : ");
		stuId=scn.nextInt();
		
		System.out.print("Enter Name : ");
		stuName=scn.next();
		
		System.out.print("Enter Mark 1 : ");
		mark1=scn.nextInt();
		
		System.out.print("Enter Mark 2 : ");
		mark2=scn.nextInt();
		
		System.out.print("Enter Mark 3 : ");
		mark3=scn.nextInt();
		
		total= mark1+mark2+mark3;
		
		avg=(float)total/3;
		
		System.out.println("Student Information : ");
		System.out.println("Name : "+ stuName);
		System.out.println("Id : "+ stuId);
		System.out.println("Mark 1 : "+ mark1);
		System.out.println("Mark 2 : "+ mark2);
		System.out.println("Mark 3 : "+ mark3);
		System.out.println("Total : "+ total);
		System.out.println("Average : "+ avg);
		
		if(avg>90) {
			System.out.println("Excellent");
		}
		else if(avg>80) {
			System.out.println("Very Good");
		}
		else if(avg>70) {
			System.out.println("Good");
		}
		else if(avg>60) {
			System.out.println("Work Hard");
		}
		else if(avg>50) {
			System.out.println("Poor");
		}
		else {
			System.out.println("Fail");
		}
		
	}
}
