package day_03_starter;

public class DoublyLinkedList<T> {
	public class Node {
		T data;
		Node prev;
		Node next;
		
		public Node(T data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	
	Node dummyhead;
	Node tail;
	int length;
	
	public DoublyLinkedList() {
		dummyhead = new Node(null);
		tail=dummyhead;
		length=0;
	}
	
	public void insertFirst(T data) {
		Node newnode = new Node(data); 
		if(length==0){
			dummyhead.next=newnode; 
			newnode.prev=dummyhead; 
			tail=newnode; 
		}
		else{
			dummyhead.next.prev=newnode;
			newnode.next=dummyhead.next;
			dummyhead.next=newnode;
			newnode.prev=dummyhead;
		}
		length++; 
	}
	
	public void insertLast(T data) {
		
	}
	
	public void insertAtPosition(T data, int pos) {
		
	}
	
	public void removeFirst(T data) {
		
	}
	
	public void removeLast(T data) {
		
	}
	
	public void removeAtPosition(T data, int pos) {
		
	}
	
	public boolean isPresent(Node n) {
		return true;
	}
	
	public boolean isEmpty() {
		return true;
	}
	
	public Node getFirst() {
		return null;
	}
	
	public Node getLast() {
		return null;
	}
	
	public int getLength() {
		return -1;
	}
	
	public T[] toArray() {
		return null;
	}
	
	public T[] toArrayInverse() {
		return null;
	}
	
}
