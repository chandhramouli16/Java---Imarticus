package Assignments;

import java.util.Scanner;

public class StringSplit {

	public static void main(String args[]) {
		
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		
		char[] ch=str.toCharArray();
		
		int digitCount=0,lowerCaseCount=0,upperCaseCount=0,spaceCount=0,consCount=0,vowelsCount=0,specialCharCount=0;
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isLowerCase(ch[i])) {
				if(lowerCaseCount==0)
					System.out.println("First LowerCase : "+(i+1));
				lowerCaseCount++;
				if((int)ch[i]==65 || (int)ch[i] == 69 || (int)ch[i] == 73 ||(int) ch[i] == 79 ||(int) ch[i] == 85 ||(int)ch[i] == 97 ||(int) ch[i] == 101 ||(int) ch[i] == 105 ||(int) ch[i] == 111 || (int)ch[i] == 117) {
					if(vowelsCount==0)
						System.out.println("First Vowel : "+(i+1));
					vowelsCount++;
					continue;
				}
				if((int)ch[i]!=65&&(int)ch[i] != 69&&(int)ch[i] != 73&&(int) ch[i] != 79&&(int) ch[i] != 85&&(int)ch[i] != 97&&(int) ch[i] != 101&&(int) ch[i] != 105&&(int) ch[i] != 111&&(int)ch[i] != 117) {
					if(consCount==0)
						System.out.println("First Consonant : "+(i+1));
					consCount++;
				}
			}
			else if(Character.isUpperCase(ch[i])) {
				if(upperCaseCount==0)
					System.out.println("First UpperCase : "+(i+1));
				upperCaseCount++;
				if((int)ch[i]==65 || (int)ch[i] == 69 || (int)ch[i] == 73 ||(int) ch[i] == 79 ||(int) ch[i] == 85 ||(int)ch[i] == 97 ||(int) ch[i] == 101 ||(int) ch[i] == 105 ||(int) ch[i] == 111 || (int)ch[i] == 117) {
					if(vowelsCount==0)
						System.out.println("First Vowel : "+(i+1));
					vowelsCount++;
					continue;
				}
				if((int)ch[i]!=65&&(int)ch[i] != 69&&(int)ch[i] != 73&&(int) ch[i] != 79&&(int) ch[i] != 85&&(int)ch[i] != 97&&(int) ch[i] != 101&&(int) ch[i] != 105&&(int) ch[i] != 111&&(int)ch[i] != 117) {
					if(consCount==0)
						System.out.println("First Consonant : "+(i+1));
					consCount++;
				}
			}
			else if(ch[i]==' ') {
				if(spaceCount==0)
					System.out.println("First WhiteSpace : "+(i+1));
				spaceCount++;
				continue;
			}
			else if(Character.isDigit(ch[i])) {
				if(digitCount==0)
					System.out.println("First Digit : "+(i+1));
				digitCount++;
				continue;
			}
			else {
				if(specialCharCount==0)
					System.out.println("First SpecialCharacter : "+(i+1));
				specialCharCount++;
			}
		}
		
		scn.close();
	}
	
}

/*public class StringSplit {
    static void firstIndexes(String str){
        boolean consonant,vowel,capital,small,special,number,space;
        consonant = vowel = capital = small = special = number = space =false;
        int i;
        char ch;
        int count = 0;
        for(i=0; i<str.length(); i++){
            if(count == 7)
                break;
            ch = str.charAt(i);
            if(!space && ch == ' '){
                System.out.println("T first whitespace is " + (i+1));
                space = true;
                count++;
            }
            else if(!number && Character.isDigit(ch)){
                System.out.println(" first number is " + (i+1));
                number = true;
                count++;
            }
            if(Character.isLetter(ch)){
                if(!small && Character.isLowerCase(ch)){
                	System.out.println(" first lowercase character is "+ (i+1));
                    small = true;
                    count++;
                }
                else if(!capital && Character.isUpperCase(ch)){
                    System.out.println(" first uppercase character is "+ (i+1));
                    capital = true;
                    count++;
                }
                if(!vowel || !consonant){
                    ch = Character.toLowerCase(ch);
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
                        System.out.println(" first vowel is " + (i+1));
                        vowel = true;
                        count++;
                    }
                    else{
                        System.out.println(" first consonant  is " + (i+1));
                        consonant = true;
                        count++;
                    }
                }
            }
            else if(!special && ch != ' '){
            	if(ch=='@'||ch=='#'||ch=='$'||ch=='&'||ch=='_'||ch=='-'||ch=='%')
                System.out.println(" first special character is " + (i+1));
                special = true;
                count++;
            }
        }
    }
    // Function to read the string
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        try {
            str = s.nextLine();
        } catch (Exception e) {
            System.out.println("An I/O error occurred");
            return;
        }
        System.out.println("The first indexes are");
        firstIndexes(str);
        s.close();
    }
}
*/