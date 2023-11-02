package program;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Character : ");
		char ch=scn.next().charAt(0);
		
		/*if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println(ch+" is a vowel");
		}
		else {
			System.out.println(ch+" is a consonant");
		}*/
		
		switch(ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(ch+" is a vowel");
			break;
		default:
			System.out.println(ch+" is a consonant");
		}
		
		scn.close();
		
	}

}
