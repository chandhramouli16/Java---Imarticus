package PatternPrgms;
import java.util.Scanner;
public class NumberPyramid {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=scn.nextInt();
		
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int space=n;space>i;space--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(num++ +"  ");
			}
			System.out.println();
		}
		
	}

}
