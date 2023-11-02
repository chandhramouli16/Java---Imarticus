package program;

import java.util.Scanner;

public class LongToByte {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number : ");
		long l=scn.nextInt();
		
		byte b=(byte) l;
		System.out.println("Conversion into byte : "+b);
		
		//Data will be lost when converting from higher value to lower value
		
		scn.close();
	}

}
