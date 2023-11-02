package Datatype;
import java.util.Scanner;
public class Student {
	public static void main(String args[]) {
		
		int stuId;
		String stuName;
		int mark1;
		int mark2;
		int mark3;
		
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
		
		float total;
		total= mark1+mark2+mark3;
		
		float avg;
		avg=total/3;
		
		System.out.println("Student Information : ");
		System.out.println("Name : "+ stuName);
		System.out.println("Id : "+ stuId);
		System.out.println("Mark 1 : "+ mark1);
		System.out.println("Mark 2 : "+ mark2);
		System.out.println("Mark 3 : "+ mark3);
		System.out.println("Total : "+ total);
		System.out.println("Average : "+ avg);
		
	}

}
