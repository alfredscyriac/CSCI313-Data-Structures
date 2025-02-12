package day_04_lists;

public class LinkedList {
	//---------------------Nested Node Class---------------------//
	public class Node {
		String data;
		Node next;
				
		public Node(String data) {
			
		}

	}
	//-----------------------------------------------------------//
	
	Node dummyhead;
	Node tail;
	int length;
	
	public LinkedList() {
		
	}
	
	public void insertFirst(String data) {
		
	}
	
	public void insertLast(String data) {
		
	}
	
	public void insertAtPosition(String data, int pos) {
		
	}
	
	public void removeFirst() {
		
	}
	
	public void removeLast() {
		
	}
	
	public void removeAtPosition(int pos) {
			
	}
	
	public boolean isPresent(Node n) {
		return false;
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
	
	public void print() {
		Node<T> curr = this.dummyhead.next;
		while(curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println(this.length);
	}
	
}
