package Oops_in_Java;
class Person1{
	public void role() {
		System.out.println("son or daughter");
	}
}
public class Overriding extends Person1 {
	public void role() {
		super.role();
		System.out.println("student");
	}

	public static void main(String[] args) {
		Overriding or =new Overriding();
		or.role();
		

	}

}
