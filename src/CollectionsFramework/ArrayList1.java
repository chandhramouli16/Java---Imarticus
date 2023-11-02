package CollectionsFramework;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//Creating ArrayList
		ArrayList<String> alist=new ArrayList<String>();
		
		//Adding elements to ArrayList
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		
		System.out.println("Printing alist : ");
		System.out.println(alist);
		
		alist.add(3,"Steve"); //Adding using index value
		
		System.out.println("Printing alist after adding element : ");
		System.out.println(alist);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		@SuppressWarnings("rawtypes") //To avoid warnings when create array of multiple data type
		ArrayList<Comparable> list=new ArrayList<Comparable>(); //New generic type
		list.add("Jim");
		list.add("Pam");
		list.add(1234);
		list.add(4.0);
		
		System.out.println("Printing list : ");
		System.out.println(list);
		
		list.remove(2); //Removing using index value
		list.remove("Pam"); //Removing using element
		
		System.out.println("Printing list after removing elements : ");
		System.out.println(list);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		System.out.println("Printing size of alist : ");
		System.out.println(alist.size());
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Steve");
		names.add("Tim");
		names.add("Lucy");
		names.add("Pat");
		names.add("Angela");
		names.add("Tom");
		
		System.out.println("Printing names : ");
		System.out.println(names);
		
		Collections.sort(names);
		
		System.out.println("Printing names after sorting using for-each : ");
		for(String str1:names) {
			System.out.print(str1+" "); //Printing using for each loop
		}
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		System.out.println("Updating names at index 3 : ");
		names.set(3, "Dwight");  //Updating with index
		System.out.println(names);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		System.out.println("Printing particular index : ");
		System.out.println(names.get(3)); //To print particular index in ArryList
		
		System.out.println("Printing indexOf particular element : ");
		System.out.println(names.indexOf("Dwight"));
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		System.out.println("contains()");
		System.out.println(names.contains("Angela"));
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		System.out.println("Clearing ArrayList 'list' : ");
		list.clear();
		System.out.println(list);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		System.out.println("Printing using iterator : ");
		Iterator<String> itr=names.iterator(); //To print the ArrayList in forward direction
		while(itr.hasNext()) {
			Object element=itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println();
		
		ListIterator<String> litr=names.listIterator(); 
		
		System.out.println("Modifying and printing using ListIterator : ");
		while(litr.hasNext())  
        {  
            Object element=litr.next();  
            litr.set(element+"+");//Modifying contents of names  
        }  
		
		itr=names.iterator();
		while(itr.hasNext()) {
			Object element=itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Printing backwards using ListIterator : ");
		while(litr.hasPrevious())  //Can only be used if the list is at the last index
        {  
            Object str=litr.previous();  
            System.out.print(str+" "); //To print the ArrayList in backward direction
        }  
		System.out.println();
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		Scanner scn= new Scanner(System.in);
		ArrayList<String> list2=new ArrayList<String>();
		
		System.out.println("Enter number of elements in ArrayList : ");
		int n=scn.nextInt();
		
		System.out.println("Enter elements one by one : ");
		for(int i=0;i<n;i++) {
			list2.add(scn.next());	
		}
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		scn.close();
	}

}
