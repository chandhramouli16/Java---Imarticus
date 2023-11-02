package CollectionsFramework;

import java.util.*;

public class Stack1 {

	public static void popEle(Stack<Integer> s) {
		
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Deleted element : "+s.pop());
		
			System.out.println("Elements in the stack : ");
			System.out.println(s+" ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		//Creating an instance of Stack class
		Stack<Integer> stk=new Stack<Integer>();
		
		//Checking stack is empty or not
		boolean result=stk.empty();
		System.out.println("Stack is empty : "+result);
		
		//Pushing elements into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(130);
		
		//Printing elements of the stack
		System.out.println("Elements in the stack : "+stk);
		result=stk.empty();
		System.out.println("Stack is empty : "+result);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//Deleting elements in the stack using pop()
		//Deletes lastly inserted element since stack is LastInFirstOut
		//try {
			popEle(stk);
			popEle(stk);
		//}
		//catch(EmptyStackException e){
		//	System.out.println("Stack is empty");
		//}
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//peek() returns element on the top of the stack
		System.out.println("peek() : "+stk.peek());
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//search() returns the location from top of the stack
		System.out.println("stk.search(78) : "+stk.search(78));
				
		System.out.println();
		System.out.println("_________________________________________________");
				
		//________________________________________________________________________//
		
	}

}
