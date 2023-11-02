package PatternPrgms;
import java.util.Scanner;
public class CharPyramid1 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=scn.nextInt();
		
		char ch='a';
		char value;
		for(int i=1;i<=n;i++) {
			value=ch;
			for(int space=n;space>i;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(value-- +" ");
			}
			ch++;
			System.out.println();
		}
		
	}

}
