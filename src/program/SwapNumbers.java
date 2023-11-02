package program;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int A=10;
		int B=20;
		
		System.out.println("Before Swap : ");
		System.out.println("A : "+A);
		System.out.println("B : "+B);
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("After Swap : ");
		System.out.println("A : "+A);
		System.out.println("B : "+B);
		
	}

}
