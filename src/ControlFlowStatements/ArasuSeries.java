//2,5,10,17,26,37
package ControlFlowStatements;
import java.util.Scanner;
public class ArasuSeries {

	public static void main(String[] args) {

		int num;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=scn.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.print((i*i+1)+" ");
		}
		scn.close();
		
	}

}

