package RegEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexEx1 {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("abb");
		Matcher m=p.matcher("aabbabbabbaaa");
		while(m.find()) {
			System.out.println("Start : "+m.start()+" End : "+
								m.end()+" Group : "+m.group());
		}
		
	}

}
