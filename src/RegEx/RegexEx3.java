package RegEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexEx3 {

	public static void main(String[] args) {

		String line="This order was placed for QT3000! OK?";
		Pattern p=Pattern.compile("(.*?)(\\d+)(.*)");
		Matcher m=p.matcher(line);
		while(m.find()) {
			System.out.println("Group 1: "+m.group(1));
			System.out.println("Group 2: "+m.group(2));
			System.out.println("Group 3: "+m.group(3));
		}
		
	}

}
