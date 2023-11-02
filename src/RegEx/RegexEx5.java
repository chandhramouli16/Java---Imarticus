package RegEx;

import java.util.regex.*;  

class RegexEx5{  

	public static void main(String[] args){  
	
		/*Create a regular expression that accepts alphanumeric characters only.  
		Its length must be six characters long only.*/ 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")); // true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false - more than 6 char  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false - $ is not matched  

		/*Create a regular expression that accepts 10 digit numeric characters 
		 starting with 7, 8 or 9 only.*/ 
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  
		  
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
		  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)  
		
	}
	
}  