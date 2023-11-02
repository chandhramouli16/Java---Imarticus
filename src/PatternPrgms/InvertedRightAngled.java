package PatternPrgms;
import java.util.Scanner;
public class InvertedRightAngled {

	public static void main(String[] args) {

		Scanner sn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=sn.nextInt();
				
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		
	}

}
