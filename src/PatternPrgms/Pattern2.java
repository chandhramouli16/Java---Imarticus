/*
 *      * * * * *
 *     * * * * *
 *    * * * * *
 *   * * * * *
 *  * * * * *
 * 
 * */
package PatternPrgms;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n=scn.nextInt();
		
		int i;
		int j;
		int space;
		for(i=1;i<=n;i++) {
			if(i==n) {
				for(j=n;j>=1;j--) {
					System.out.print("* ");
				}
			}
			else {
				for(space=n;space>i;space--) {
					System.out.print(" ");
				}
				for(j=n;j>=1;j--) {
					System.out.print("* ");
				}
				
				}
			System.out.println();
		}
		
	}

}
