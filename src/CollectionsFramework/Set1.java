package CollectionsFramework;

import java.util.*;

public class Set1 {

	public static void main(String[] args) {

		//Getting set values from array
		Integer[] A= {22,45,33,66,55,34,77};
		Integer[] B= {33,2,83,45,3,12,55};
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		Set<Integer> set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		
		System.out.println("Printing Set1 after getting elements from Array 'A' : ");
		System.out.println(set1);
		
		System.out.println("Printing Set2 after getting elements from Array 'B' : ");
		System.out.println(set1);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//Creating new set to make set1 UNION set2
		Set<Integer> unionSet=new HashSet<Integer>(set1);
		unionSet.addAll(set2); //addAll() is used to find union of 2 sets
		
		System.out.println("Union of set1 and set2 : ");
		System.out.println(unionSet);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		//Creating new set to make set1 INTERSECTION set2
		Set<Integer> intersectionSet=new HashSet<Integer>(set1);
		intersectionSet.retainAll(set2); //retainAll() is used to find intersection of 2 sets
			
		System.out.println("Intersection of set1 and set2 : ");
		System.out.println(intersectionSet);
				
		System.out.println();
		System.out.println("_________________________________________________");
				
		//________________________________________________________________________//
		
		//Creating new set to find difference between set1 and set2
		Set<Integer> differenceSet=new HashSet<Integer>(set1);
		differenceSet.removeAll(set2); //removeAll() is used to find difference of 2 sets
			
		System.out.println("Differnce of set1 and set2 : ");
		System.out.println(differenceSet);
				
		System.out.println();
		System.out.println("_________________________________________________");
				
		//________________________________________________________________________//
		
		int count[]= {34,22,10,60,30,22};
		Set<Integer> set3=new HashSet<Integer>(); //HashSet does not sort elements
		for(int i=0;i<count.length;i++) {
			set3.add(count[i]);
		}
		
		System.out.println("Printing HashSet after getting elements from Array 'count' : ");
		System.out.println(set3);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		TreeSet<Integer> sortedSet=new TreeSet<Integer>(set3); //TreeSet sorts elements by default
		System.out.println("The sorted TreeSet is : ");
		System.out.println(sortedSet);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
		System.out.println("The first element of the set is : "+sortedSet.first());
		
		System.out.println("The last element of the set is : "+sortedSet.last());
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
	}

}
