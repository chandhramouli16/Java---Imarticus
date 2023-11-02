package CollectionsPractice;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisMatchingStack {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		//Creating stack
		Stack<Integer> stk=new Stack<Integer>();
		System.out.println("Paranthesis matching Test\n");
		
		//Accepting expression
		System.out.println("Enter expression : ");
		String exp=scn.next();
		int len=exp.length();
		
		System.out.println("\nMatches and Mismatches : \n");
		for(int i=0;i<len;i++) {
			char ch=exp.charAt(i);
			if(ch=='(')
				stk.push(i);
			else if(ch==')') {
				try {
					int p=stk.pop()+1;
					System.out.println("')' at position "+(i+1)+" matched with '(' at position "+p);
				}
				catch(Exception e) {
					System.out.println("')' at position "+(i+1)+" is unmatched");
				}
			}
		}
		
		while(!stk.isEmpty()) 
			System.out.println("'(' at position "+(stk.pop()+1)+" is unmatched");

		scn.close();
	}

}
