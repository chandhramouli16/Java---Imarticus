package OopsPractice;

class Employee {

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
public class TestEmployee1 {

	public static void main(String[] args) {

		Employee emp1=new Employee();
		emp1.getEmpDet(101,"Mouli",33000,5000);
		emp1.viewEmpDet();		
		
	}

}
