package Assesment1;
public class ArmstrongNumber {

	public static void main(String[] args) {

		int num=1;
		int count=0;
		
		int n=num;
		
		while(n!=0) {
			count++;
			n=n/10;
		}

		n=num;
		int rem;
		int result=0;
		
		while(n!=0) {
			rem=n%10;
			result=(int) (result+Math.pow(rem,count));
			n=n/10;
			}
		
		if(num==result) {
			System.out.println("It is an Armstrong number");
		}
		else {
			System.out.println("It is not an Armstrong number");
		}
				
	}

}
