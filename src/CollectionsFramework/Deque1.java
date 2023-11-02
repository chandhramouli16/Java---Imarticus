package CollectionsFramework;

import java.util.*;

public class Deque1 {

	public static void main(String[] args) {
		
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Glenn");
		dq.add("Negan");
		dq.addLast("Maggie");
		dq.addFirst("Rick");
		dq.add("Daryl");

		System.out.println("Elements in Deque : "+dq);
		System.out.println("Removed Element : "+dq.removeLast());
		System.out.println("Elements in Deque : "+dq);
		System.out.println("Removed Element : "+dq.removeFirst());
		System.out.println("Elements in Deque : "+dq);
		dq.addFirst("Charlie");
		System.out.println("Elements in Deque : "+dq);
		System.out.println("Head : "+dq.element());
		System.out.println("poll() : "+dq.poll());
		System.out.println("peek() : "+dq.peek());
		System.out.println("Elements in Deque : "+dq);
		System.out.println("Deque is Empty : "+dq.isEmpty());
		
	}
	
}
