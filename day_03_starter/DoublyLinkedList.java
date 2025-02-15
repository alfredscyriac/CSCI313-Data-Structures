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
		Node newnode = new Node(data);
		tail.next = newnode; 
		newnode.prev=tail; 
		tail=newnode; 
		length++; 
	}
	
	public void insertAtPosition(T data, int pos) {
		Node newnode = new Node(data); 
		Node curr = dummyhead; 
		if(pos<=0){
			insertFirst(data); 
		}
		else if(pos>=length+1){
			insertLast(data);
		}
		else{
			for(int i=0; i<pos-1;i++){
				curr=curr.next; 
			}
			newnode.next=curr.next; 
			curr.next.prev=newnode;
			curr.next=newnode;
			newnode.prev=curr; 
			length++;
		}
	}
	
	public void removeFirst(T data) {
		
	}
	
	public void removeLast(T data) {
		
	}
	
	public void removeAtPosition(T data, int pos) {
		
	}
	
	public boolean isPresent(Node n) {
		Node curr = dummyhead.next; 
		while(curr!=null){
			if(curr==n){
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(length==0){
			return true;
		}
		return false;
	}
	
	public Node getFirst() {
		if(length>0){
			return dummyhead.next;
		}
		return null; 
	}
	
	public Node getLast() {
		if(length==0){
			return null;
		}
		return tail; 
	}
	
	public int getLength() {
		return length;
	}
	
	public T[] toArray() {
		return null;
	}
	
	public T[] toArrayInverse() {
		return null;
	}
	
}
