package CollectionsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SelfOrganizingList {

private ArrayList<Integer> list;
private ArrayList<Integer> count;
public int size=0;
	
	public SelfOrganizingList(int size) {
		this.size=size;
		list=new ArrayList<Integer>(size);
		count=new ArrayList<Integer>(size);
	}
	
	public void add(int ele) {
		list.add(ele);
		count.add(0);
	}
	
	public void deleteAtPosition(int pos) {
		list.remove(pos-1);
		count.remove(pos-1);
	}
	
	public void search(int ele) {
		if(list.contains(ele)) {
			int index=list.indexOf(ele);
			int tempList=list.get(index);
		
			count.set(index, count.get(index)+1);
			int tempCount=count.get(index);
		
			for(int i=index;i>0;i--) {
				list.set(i, list.get(i-1));
				count.set(i, count.get(i-1));
			}
		
			list.set(0, tempList);
			count.set(0, tempCount);
		}
		else {
			System.out.println("Element not found");
		}
	}
	
	public boolean isEmpty() {
		return list.size()==0 || list==null;
	}
	
	public boolean isFull() {
		return list.size()==size;
	}
	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Self Organizing List\n");
		
		System.out.println("Enter size of the list : ");
		int size=scn.nextInt();
		SelfOrganizingList l=new SelfOrganizingList(size);
		
		char ch;
		do {
			System.out.println("\nList operations : ");
			System.out.println("1. Insert");
			System.out.println("2. Delete at position");
			System.out.println("3. Search");
			System.out.println("4. Chech empty");
			System.out.println("5. Check Full");
			System.out.println("6. Get size");
			
			int choice=scn.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter integer element to add : ");
				l.add(scn.nextInt());
				break;
			case 2:
				System.out.println("Enter the position to delete : ");
				l.deleteAtPosition(scn.nextInt());
				break;
			case 3:
				System.out.println("Enter the element to search : ");
				l.search(scn.nextInt());
				break;
			case 4:
				System.out.println("List is empty : "+l.isEmpty());
				break;
			case 5:
				System.out.println("List is full : "+l.isFull());
				break;
			case 6:
				System.out.println("Size of the list : "+l.size);
				break;
			default:
				System.out.println("Wrong Entry\n");
				break;
			}
			//Display list
			System.out.println();
			System.out.println("List : "+l.list);
			System.out.println("Count : "+l.count);
			
			System.out.println("\nDo you want to continue(Type Y or N)?\n");
			ch=scn.next().charAt(0);
			
		}while(ch=='Y'||ch=='y');
		
		scn.close();
	}	

}
