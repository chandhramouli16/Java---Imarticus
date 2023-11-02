package Operators;

public class IncDecrement {

	public static void main(String[] args) {
		
		int a;
		int b;
		int result1;
		int result2;
		a=12;
		b=12;
		
		System.out.println("Value of a : "+a);
		
		result1=a++;
		
		System.out.println("After increment: "+result1);
		System.out.println("Value of b:"+b);
		
		result2= --b;
		System.out.println("After decrement: "+result2);

	}

}
