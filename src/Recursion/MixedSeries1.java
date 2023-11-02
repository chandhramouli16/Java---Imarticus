// 0,1,2,1,4,2,6,6,8,24,10,120
package Recursion;

public class MixedSeries1 {

	static int n1=1;
	static int n2=1;
	static int n3=0;
	
	public static void oddPlaces() {
		
		n3=n1;
		System.out.print(n3+" ");
		n1=n1*n2; 
		n2++; 
		
	}
		
	public static void main(String[] args) {

		for(int i=0;i<12;i++) {
			
			if(i%2!=0) {
				oddPlaces();
			}
			
			else {
				System.out.print(i+" ");
			}
			
		}
		
	}

}
