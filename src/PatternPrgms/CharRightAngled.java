
/* A
 * AB
 * ABC
 * ABCD
 * ABCDE
 * 
 */
package PatternPrgms;
import java.util.Scanner;
public class CharRightAngled {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=scn.nextInt();
		
		char ch;
		for(int i=1;i<=n;i++) {
			ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch++);	
			}
			System.out.println();
		}
		
	}

}
