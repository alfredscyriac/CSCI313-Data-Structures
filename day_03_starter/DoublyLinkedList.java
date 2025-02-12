package day_04_lists;

public class DoublyLinkedList {
	//---------------------Nested Node Class---------------------//
	public class Node {
		String data;
		Node prev;
		Node next;
		
		public Node(String data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	//-----------------------------------------------------------//
	
	Node dummyhead;
	Node tail;
	int length;
	
	public DoublyLinkedList() {
		
	}
	
	public void insertFirst(T data) {
		return;
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
