package Oops_in_Java;
class overload{
	void demo(int a) {
		System.out.println("a: "+a);
	}void demo(int a,int b){
		System.out.println("a and b: "+a+","+b);
	}double demo(double a){
		System.out.println("double a: "+a);
		return a*a;
				
	}
}

public class Overloading {

	public static void main(String[] args) {
		overload obj=new overload();
		double result;
		obj.demo(10);
		obj.demo(10,20);
		result=obj.demo(5.5);
		System.out.println("output: "+result);

	}

}
