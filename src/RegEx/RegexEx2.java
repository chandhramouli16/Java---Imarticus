package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String to match : ");
		String str=scn.nextLine();
		Pattern p=Pattern.compile("javaTraining",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(str);
		boolean matchFound=m.find();
		if(matchFound)
			System.out.println("Match found");
		else
			System.out.println("Match not found");
		
		scn.close();
	}

}
