//Convert integer to byte char float
package program;

import java.util.Scanner;

public class IntegerConversion {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.print("Enter integer : ");
		int d=scn.nextInt();
		
		byte b=(byte) d;
		char c=(char) d;
		float f=d;// Not using (float) because float > int
		System.out.println("Conversion into byte : "+b);
		System.out.println("Conversion into char : "+c);
		System.out.println("Conversion into float : "+f);
		
		scn.close();
		
	}

}
