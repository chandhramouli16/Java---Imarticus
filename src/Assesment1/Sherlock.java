package Assesment1;

public class Sherlock {

	public static void main(String[] args) {

		int N=3; //No. of Apples
		int M=2; //No. of People
		if(N>=1 && M>=1 && N<=1000 && M<=1000) {
			if(N%M==0) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}

}