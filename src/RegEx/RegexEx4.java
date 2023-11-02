package RegEx;

import java.util.regex.*;

public class RegexEx4 {

	public static void main(String[] args) {
		
		//1st Way
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		
		//2nd Way
		boolean b2=Pattern.compile("\\d").matcher("1234").matches(); //Checks digits
		
		//3rd Way
		boolean b3=Pattern.matches(".s."," s ");
		
		System.out.println(b+" "+b2+" "+b3);
		
		System.out.println(Pattern.matches("\\D","da"));    //Checks non-digits
		System.out.println(Pattern.matches("\\D+","ddaa")); //Occurs once or more
		System.out.println(Pattern.matches("\\D*",""));     //Occurs zero or more
		
		
	}

}
