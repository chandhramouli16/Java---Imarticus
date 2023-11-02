package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedArrayList {

	private ArrayList<Integer> list;
	
	public SortedArrayList() {
		list=new ArrayList<Integer>();
	}
	
	//Function to check if list is empty
	public boolean isEmpty() {
		return list.size()==0 || list==null;
	}
	
	//Function to clear list
	public void clear() {
		list=new ArrayList<Integer>();
	}
	
	//Function to get size of list
	public int size() {
		return list.size();
	}
	
	//Function to add elements to the list
	public void add(int ele) {
		int pos=list.size();
		list.add(ele);
		while(pos>0&&ele<list.get(pos-1)) {
			list.set(pos, list.get(pos-1));
			pos--;
		}
		list.set(pos, ele);
	}
	
	//Function to remove element at index
	public void remove(int index) {
		list.remove(index);
	}
	
	//Function to perform binary search
	public int binarySearch(int ele) {
		return Collections.binarySearch(list, ele);
	}
	
	//Function to check if element is present in list
	public boolean contains(int ele) {
		return binarySearch(ele)>=0;
	}
	
	//Function to string
	public String toString() {
		return list.toString();
	}
	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		SortedArrayList sal=new SortedArrayList();
		
		System.out.println("Sorted List Test\n");
		char ch;
		do {
			System.out.println("\nSorted List operations : ");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Binary search");
			System.out.println("4. Contains");
			System.out.println("5. Check empty");
			System.out.println("6. Get size");
			System.out.println("7. Clear");
			
			int choice=scn.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter integer element to add : ");
				sal.add(scn.nextInt());
				break;
			case 2:
				System.out.println("Enter Index : ");
				sal.remove(scn.nextInt());
				break;
			case 3:
				System.out.println("Enter integer element to search : ");
				System.out.println("Binary Search result : "+sal.binarySearch(scn.nextInt()));
				break;
			case 4:
				System.out.println("Enter integer element : ");
				System.out.println("Contains result : "+sal.contains(scn.nextInt()));
				break;
			case 5:
				System.out.println("Empty status : "+sal.isEmpty());
				break;
			case 6:
				System.out.println("Size = "+sal.size());
				break;
			case 7:
				System.out.println("Sorted list cleared");
				sal.clear();
				break;
			default:
				System.out.println("Wrong Entry\n");
				break;
			}
			//Display list
			System.out.println(sal.list);
			
			System.out.println("\nDo you want to continue(Type Y or N)?\n");
			ch=scn.next().charAt(0);
			
		}while(ch=='Y'||ch=='y');
		
		scn.close();
	}

}
