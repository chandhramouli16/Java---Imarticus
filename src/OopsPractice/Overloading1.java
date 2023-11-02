package OopsPractice;

class Overload{
	
	void demo(String a) {
		System.out.println(a);
	}
	
	void demo(String a,String b){
		System.out.println(a+" "+b);
	}
	
	Double demo(double a){
		System.out.println(a);
		return a*a;	
	}
	
}

public class Overloading1 {

	public static void main(String[] args) {
		
		Overload obj=new Overload();
		double result;
		obj.demo("Mouli");
		obj.demo("Mouli","Kaviya");
		result=obj.demo(10.10);
		System.out.println("Output: "+result);

	}

}
