package Assesment1;

public class Calculator {

	public static void main(String[] args) {
		
		int first=15;
		int second=4;
		int result=1;
		char operator='/';
	
		switch(operator) {
			case'+':
				result=first+second;
				break;
			case'-':
				result=first-second;
				break;
			case'*':
				result=first*second;
				break;
			case'/':
				result=first/second;
				break;
			default:
				System.out.println("error operator is not correct");
		}
		
		System.out.println(result);	

	}

}
