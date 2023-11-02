package CollectionsFramework;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		
		//Creating LinkedList
		LinkedList<String> list=new LinkedList<String>();
		
		//Adding elements to the LinkedList
		list.add("Steve");
		list.add("Carl");
		list.add("Ram");
		list.add("Raj");
		
		list.addFirst("Negan"); //Adding element at 0th index using addFirst()
		
		list.addLast("Rick"); //Adding element at last index using addLast()
		
		list.add(2,"Glenn"); //Adding element using index value
		
		//Iterating LinkedList
		System.out.println("Printing LinkedList using Iterator : ");
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		list.removeFirst();//Removing first element
		
		list.removeLast();//Removing last element
		
		list.remove(2);//Removing last element
		
		iterator=list.iterator(); //Reinitializing to starting value
		System.out.println("Printing LinkedList after removing elements : ");
		while(iterator.hasNext()) {
		System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		Object obj=list.clone(); //Cloning the LinkedList
		
		System.out.println("Printing cloned LinkedList : ");
		System.out.println(obj);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		Object obj1=list.get(0); //Printing particular index
		System.out.println("Printing particular element in LinkedList : ");
		System.out.println(obj1);
		
		list.set(0,"Scott"); //Updating at a particular index in LinkedList
		System.out.println("Printing updated LinkedList : ");
		System.out.println(list);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		list.poll(); //Removing first element using poll()
		System.out.println("Printing LinkedList after using poll() : ");
		System.out.println(list);
		
		list.pollFirst();//Removing first element
		
		list.pollLast();//Removing last element
		
		System.out.println("Printing LinkedList after using pollFirst() and pollLast() : ");
		System.out.println(list);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		list.add("Steve");
		list.add("Carl");
		list.add("Ram");
		list.add("Raj");
		list.add("Steve");
		
		System.out.println("Printing LinkedList : ");
		System.out.println(list);
		
		list.removeFirstOccurrence("Ram"); //Removing first occurrence of 'Ram' in LinkedList
		System.out.println("Printing LinkedList after removing first occurrence of 'Ram': ");
		System.out.println(list);
		
		list.removeLastOccurrence("Steve"); //Removing last occurrence of 'Steve' in LinkedList
		System.out.println("Printing LinkedList after removing first occurrence of 'Steve': ");
		System.out.println(list);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
	}

}
