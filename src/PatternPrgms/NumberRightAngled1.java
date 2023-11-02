
/* 1
 * 21
 * 321
 * 4321
 * 54321
 * 
 */
package PatternPrgms;
import java.util.Scanner;
public class NumberRightAngled1 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);	
			}
			System.out.println();
		}
		
	}

}
