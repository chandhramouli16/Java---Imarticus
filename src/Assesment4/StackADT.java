package Assesment4;

import java.util.*;

public class StackADT {

	public static void main(String[] args) {

		Stack<Integer> stk=new Stack<Integer>();
		
		System.out.println("Stack is empty : "+stk.isEmpty());
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		stk.push(16);
		stk.push(19);
		stk.push(25);
		stk.push(27);
		stk.push(8);
		
		System.out.print("Stack : "+stk);
		System.out.println();
	
		System.out.println();
		System.out.println("_________________________________________________");
		
		System.out.println("Stack is empty : "+stk.isEmpty());
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		System.out.println("Deleted Element : "+stk.pop());
		System.out.print("Stack after deletion : "+stk);
		System.out.println();
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		System.out.println("Deleted Element : "+stk.pop());
		System.out.print("Stack after deletion : "+stk);
		System.out.println();
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		System.out.println("Deleted Element : "+stk.pop());
		System.out.print("Stack after deletion : "+stk);
		System.out.println();
		
		System.out.println();
		System.out.println("_________________________________________________");
		
	}

}
