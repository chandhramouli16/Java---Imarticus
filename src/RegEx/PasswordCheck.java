package RegEx;

import java.util.regex.*;

public class PasswordCheck {

	//Function to validate password
	public static boolean isValidPassword(String password) {
		
		//Regex to check valid password
		String regex="^(?=.*[0-9])"
					 +"(?=.*[a-z])(?=.*[A-Z])"
					 +"(?=.*[@#$%^&+=])"
					 +"(?=\\S+$).{8,20}$";
			
		//Compile the regex
		Pattern p=Pattern.compile(regex);
			
		if(password==null) {
			return false;
		}
			
		//Pattern class contains matcher() method to find matching 
		//between given password and regular expression
		Matcher m=p.matcher(password);
			
		//Return if the password
		//matched the RegEx
		return m.matches();
		
	}
	
	//Driver Code
	public static void main(String[] args) {
		
		//Test Case : 1
		String str1="Pass@portal20";
		System.out.println(isValidPassword(str1));
		
		//Test Case : 2
		String str2="PasswordCheck";
		System.out.println(isValidPassword(str2));
		
		//Test Case : 3
		String str3="Pass@ portal9";
		System.out.println(isValidPassword(str3));
		
		//Test Case : 4
		String str4="1234";
		System.out.println(isValidPassword(str4));
		
		//Test Case : 5
		String str5="Check@20";
		System.out.println(isValidPassword(str5));
		
		//Test Case : 6
		String str6="check@portal20";
		System.out.println(isValidPassword(str6));
				
	}

}
