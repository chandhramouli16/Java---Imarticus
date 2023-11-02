package CollectionsFramework;

import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		
		//Creating a vector with a initial capacity of 2
		Vector<String> vec=new Vector<String>(2);
		
		// Adding elements to a vector
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		
		System.out.println("Size of the Vector : "+vec.size()); //Finding Size
		System.out.println("Default capacity increment is : "+vec.capacity()); //Finding Capacity increment
		//The capacity increments by times 2, initially if it is 2 then it'll be 2*2=4 and 4*2=8 and so on
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		vec.addElement("Fruit1");
		vec.addElement("Fruit2");
		vec.add(6,"Fruit3"); // Adding element using index value
		
		System.out.println("Size after addition : "+vec.size()); //Finding Size
		System.out.println("Capacity after increment is : "+vec.capacity()); //Finding Capacity increment
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//To display all elements, it generates all elements at a same time but on
		// using for-each, for or print statement it is generated one by one
		Enumeration<String> en=vec.elements(); 
		
		System.out.println("Vector elements are: ");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement()+" ");
		}
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
	}

}
