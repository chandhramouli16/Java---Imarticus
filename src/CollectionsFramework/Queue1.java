package CollectionsFramework;

import java.util.*;

public class Queue1 {

	public static void main(String[] args) {
		
		//We cannot create instance of Queue as it is an interface, we can create
		//instance of LinkedList or PriorityQueue and assign it to Queue
		Queue<String> q=new LinkedList<String>();
		
		//Adding elements to the queue
		q.add("Rick");		
		q.add("Maggie");
		q.add("Glenn");
		q.add("Negan");
		q.add("Daryl");
		
		System.out.println("Printing elements in the Queue : ");
		System.out.println(q);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//We can remove element from queue using remove() method, this would remove 
		//the first element from the queue
		System.out.println("Removed element : "+q.remove());
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//element() method - this returns the head of the queue
		//Head is the first element in the queue
		//When queue is empty, it shows error
		System.out.println("Head : "+q.element());
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//poll() method - this method removes and returns the head of the queue.
		//Returns null if the queue is empty
		System.out.println("poll() : "+q.poll());
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//peek() method - it works same as element() method, however it returns null
		//if queue is empty
		System.out.println("peek() : "+q.peek());
		
		System.out.println("Elements in queue : ");
		System.out.println(q);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
	}

}
