package Assesment4;

public class singlyLinkedList{
	class Node{
		int data;
		Node next;
	
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;

	public void insertAtBeginning(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}

	public void addNode(int data) {
		Node newNode= new Node(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}	
	
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	public void deleteNodeAtBeginning() {
		if (head == null) {
			System.out.println("No node to delete");
			return;
		}
		Node temp = head;
		head = temp.next;
	}

	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			System.out.println("SinglyLinkedList : ");
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println();
		}
		System.out.println("Node Ended");
	}

	public static void main(String[] args) {

		singlyLinkedList sl=new singlyLinkedList();
	
		sl.display();
		
		sl.addNode(10);
		sl.addNode(20);
		
		sl.insertAtEnd(100);
		
		sl.addNode(30);
		sl.addNode(40);
		
		sl.insertAtBeginning(1000);
		sl.insertAtBeginning(2000);
		
		sl.deleteNodeAtBeginning();	
		
		sl.display();
	
	}

}
