package program;

import java.util.Scanner;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class CheckCharacter {

	public static void main(String[] args) throws IOException {

		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Character : ");
		//BufferedReader bf=new BufferedReader(new InputStreamReader(System.in);
		//char ch=(char) bf.read();
		char ch=scn.next().charAt(0);
		
		if(ch>=97 && ch<=123) {
			System.out.println("Lowercase");
		}
		else if(ch>=65 && ch<=96) {
			System.out.println("Uppercase");
		}
		else if(ch>=48 && ch<=57){
			System.out.println("Digit");
		}
	
		scn.close();
	}

}
