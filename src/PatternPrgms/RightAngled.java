package PatternPrgms;
import java.util.Scanner;
public class RightAngled {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=scn.nextInt();
				
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		
	}

}
