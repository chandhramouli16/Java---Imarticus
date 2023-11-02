package CollectionsPractice;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArrayQueue {

	protected int queue[];
	protected int front,rear,size,len;
	
	public ArrayQueue(int n) {
		size=n;
		len=0;
		queue=new int[size];
		front=-1;
		rear=-1;
	}
	
	//Function to check if queue is empty
	public boolean isEmpty() {
		return front==-1;
	}
	
	//Function to check if queue is full
	public boolean isFull() {
		return front==0 && rear==size-1;
	}
	
	//Function to get the size of the queue
	public int getSize() {
		return len;
	}
	
	//Function to check the front element of the queue
	public int peek() {
		if(isEmpty())
			throw new NoSuchElementException("underflow Exception");
		
		return queue[front];
	}
	
	//Function to insert an element to the queue
	public void insert(int i) {
		if(rear==-1) {
			front=0;
			rear=0;
			queue[rear]=i;
		}
		else if(rear+1>=size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if(rear+1<size)
			queue[++rear]=i;
		
		len++;
	}
	
	//Function to remove front element from the queue
	public int remove() {
		if(isEmpty())
			throw new NoSuchElementException("underflow Exception");
		else {
			len--;
			int ele=queue[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			else
				front++;
			return ele;
		}
	}
	
	//Function to display the status of the queue
	public void display() {
		System.out.print("\nQueue = ");
		if(len==0) {
			System.out.print("Empty\n");
			return;
		}
		for(int i=front;i<=rear;i++)
			System.out.print(queue[i]+" ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Array Queue Test\n");
		System.out.println("Enter size of the integer queue : ");
		ArrayQueue q=new ArrayQueue(scn.nextInt());
		
		char ch;
		do {
			System.out.println("\nQueue Operations : ");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Peek");
			System.out.println("4. Check empty");
			System.out.println("5. Check full");
			System.out.println("6.Size");
			
			int choice=scn.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter integer element to insert : ");
				try {
					q.insert(scn.nextInt());
				}
				catch(Exception e) {
					System.out.println("Error : "+e.getMessage());
				}
				break;
				
			case 2:
				try {
					System.out.println("Removed Element : "+q.remove());
				}
				catch(Exception e) {
					System.out.println("Error : "+e.getMessage());
				}
				break;
				
			case 3:
				try {
					System.out.println("Peek Element : "+q.peek());
				}
				catch(Exception e) {
					System.out.println("Error : "+e.getMessage());
				}
				break;
				
			case 4:
				System.out.println("Queue is empty : "+q.isEmpty());
				break;
				
			case 5:
				System.out.println("Queue is full : "+q.isFull());
				break;
				
			case 6:
				System.out.println("Queue Size : "+q.getSize());
				break;
				
			default:
				System.out.println("Wrong Entry\n");
				break;
				
			}
			q.display();
			System.out.println("\nDo you want to continue(Type Y or N)?\n");
			ch=scn.next().charAt(0);
			
		}while(ch=='Y'||ch=='y');
		
		
		scn.close();
	}

}
