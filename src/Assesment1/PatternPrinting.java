package Assesment1;

public class PatternPrinting {

	public static void main(String[] args) {
		int n=5;
	
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=n;space++) {		
				System.out.print("");	
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
