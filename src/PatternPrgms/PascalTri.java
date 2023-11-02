package PatternPrgms;
import java.util.Scanner;
public class PascalTri {

	public static void main(String[] args) {

		int n;
		int i;
		int j;
		int space;
		int k;
		int value;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		n=scn.nextInt();
		
		for(i=1;i<=n;i++) {
			for(space=n;space>i;space--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			value=--j;
			for(k=1;k<j;k++) {
				System.out.print(--value+" ");
			}
			System.out.println();
		}
		
	}

}
