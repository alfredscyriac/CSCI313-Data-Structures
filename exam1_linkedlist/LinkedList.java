package exam1_linkedlist;

public class LinkedList {
	public class Node {
		String data;
		Node next;
				
		public Node(String data) {
			this.data=data; 
			next=null;
		}

	}
	
	Node dummyhead;
	Node tail;
	int length;
	
	public LinkedList() {
		dummyhead = new Node(null);
		tail=dummyhead;
		length=0; 
	}
	
	public void insertFirst(String data) {
		Node newnode = new Node(data);
		newnode.next=dummyhead.next;
		dummyhead.next=newnode; 
		if(length==0) tail=newnode;
		length++; 
	}
	
	public void insertLast(String data) {
		Node newnode = new Node(data);
		tail.next=newnode; 
		tail=newnode; 
		length++;
	}
	
	public void insertAtPosition(String data, int pos) {
		Node newnode = new Node(data);
		if(pos<=0 ||pos>length+1){
			System.out.println("Invalid position");
			return;
		}
		if(pos==1){
			insertFirst(data);
			length++;
			return;
		}
		else if(pos==length+1){
			insertLast(data);
			length++;
			return;
		}
		else{
			Node curr = dummyhead; 
			for(int i=1; i<pos;i++){
				curr=curr.next;
			}
			newnode.next=curr.next;
			curr.next=newnode;
			length++;
		}
	}
	
	public void removeFirst() {
		if(length==0){
			return; 
		}
		if(length==1){
			dummyhead.next=null;
			tail=dummyhead;
			length--;
			return; 
		}
		dummyhead.next=dummyhead.next.next;
		length--; 
	}
	
	public void removeLast() {
		if(length==0){
			return;
		}
		if(length==1){
			dummyhead.next=null;
			tail=dummyhead;
			length--;
			return; 
		}
		Node curr = dummyhead.next;
		while(curr.next.next!=null){
			curr=curr.next;
		}
		curr.next=null;
		tail=curr;
		length--;
	}
	
	public void removeAtPosition(int pos) {
		if(pos<=0||pos>length){
			return;
		}
		if(pos==1){
			removeFirst();
			return;
		}
		if(pos==length){
			removeLast();
			return;
		}
		Node curr = dummyhead; 
		for(int i=0; i<pos-1;i++){
			curr=curr.next;
		}
		curr.next=curr.next.next;
		length--;
		
	}
	
	public boolean isPresent(Node n) {
		Node curr=dummyhead.next;
		while(curr!=null){
			if(curr==n){
				return true;
			}
			curr=curr.next;
		}
		return false; 
	}
	
	public boolean isEmpty() {
		if(length==0) return true;
		else return false; 
	}
	
	public Node getFirst() {
		return dummyhead.next;
	}
	
	public Node getLast() {
		return tail;
	}
	
	public int getLength() {
		return length;
	}
	
	public void print() {
		Node curr = this.dummyhead.next;
		while(curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println(this.length);
	}
	
}
