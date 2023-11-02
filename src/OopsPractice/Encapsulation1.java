package OopsPractice;

class Encapsulationdemo{
	private int id;
	private String stuName;
	private int stuAge;
	
	public int getStuId() {
		return id;	
	}
	public String getStuName() {
		return stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int age) {
		stuAge=age;
	}
	public void setStuName(String name) {
		stuName=name;
	}
	public void setStuId(int id) {
		this.id=id;
	}
	
}
public class Encapsulation1 {

	public static void main(String[] args) {
		
		Encapsulationdemo obj=new Encapsulationdemo();
		obj.setStuName("Mouli");
		obj.setStuAge(23);
		obj.setStuId(1714112);
		System.out.println("Student name: "+obj.getStuName());
		System.out.println("Student id: "+obj.getStuId());
		System.out.println("Student age: "+obj.getStuAge());
		
	}

}
