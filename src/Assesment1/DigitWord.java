package Assesment1;

public class DigitWord {

	public static void main(String[] args) {

		int number=1234;
		
		int remainder;
		int result=0;
		while(number!=0) {
			remainder=number%10;
			result=(result*10)+remainder;
			number=number/10;
		}
		
		int digit=result;
		int rem=0;
		while(digit>0) {
			rem=digit%10;
			
			if(rem==1)
				System.out.print("One ");
			else if(rem==2)
				System.out.print("Two ");
			else if(rem==3)
				System.out.print("Three ");
			else if(rem==4)
				System.out.print("Four ");
			else if(rem==5)
				System.out.print("Five ");
			else if(rem==6)
				System.out.print("Six ");
			else if(rem==7)
				System.out.print("Seven ");
			else if(rem==8)
				System.out.print("Eight ");
			else if(rem==9)
				System.out.print("Nine ");
			
			digit=digit/10;
		}
		
	}

}
