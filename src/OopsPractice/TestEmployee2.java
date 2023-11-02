package OopsPractice;

import java.util.Scanner;

class Employee1 {

	int empId;
	String empName;
	int salary;
	int bonus;
	
	void getEmpDet(int id, String name, int sal, int bon) {
		empId=id;
		empName=name;
		salary=sal;
		bonus=bon;
	}
	void viewEmpDet() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Net Salary : "+(salary+bonus));
		
	}
}

public class TestEmployee2 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of Employees : ");
		int n=scn.nextInt();
		
		int[] id=new int[n];
		String[] name=new String[n];
		int[] sal=new int[n];
		int[] bon=new int[n];
		
		int num=1;
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of Emp "+num);
			num++;
			System.out.println("Enter id : ");
			id[i]=scn.nextInt();
			System.out.println("Enter name : ");
			name[i]=scn.next();
			System.out.println("Enter salary : ");
			sal[i]=scn.nextInt();
			System.out.println("Enter bonus : ");
			bon[i]=scn.nextInt();
			System.out.println();
		}
		num=1;
		
		Employee1 emp=new Employee1();
		
		for(int i=0;i<n;i++) {
			System.out.println("Details of Emp "+num);
			num++;
			emp.getEmpDet(id[i],name[i],sal[i],bon[i]);
			emp.viewEmpDet();
			System.out.println();
		}
		
	}

}
