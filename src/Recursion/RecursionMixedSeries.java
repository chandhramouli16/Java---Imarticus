// 1 2 1 3 2 5 3 7 5 11 8 13 13
package Recursion;

public class RecursionMixedSeries {

	static int n1=1;
	static int n2=0;
	static int n3;
	static int primeNum=2;
	
	public static void fibo() {
		
		n3=n1+n2;
		n1=n2; 
		n2=n3; 
		
	}

	public static int prime(int num) {
		
		for(int j=2;j<num;j++) {
			if(num%j==0) {
				num++;
				prime(num);
			}
		}
		return num;
			
	}
		
	public static void main(String[] args) {

		for(int i=1;i<=13;i++) {
			
			if(i%2!=0) {
				fibo();
				System.out.print(n3+" ");
			}
			
			else {
				primeNum=prime(primeNum);
				System.out.print(primeNum+" ");
				primeNum++;
			}
			
		}
		
	}

}
