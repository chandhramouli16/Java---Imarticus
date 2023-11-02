package Assesment1;

public class DuckNumber {

	public static void main(String[] args) {
		
		int n=340;
		int lastDigit=0;
		while(n>0) {
			lastDigit=n%10;
			if(lastDigit==0) {
				System.out.println("Duck Number");
				break;
			}
			n=n/10;
		}
		if(lastDigit!=0) {
			System.out.println("Not a Duck Number");
		}
		
	
	}

}
