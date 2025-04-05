package exam2_hashmap;

public class LinkedList<T> {
    private Node<T> dummyhead; 
    private Node<T> tail; 
    private int length;
    
    public LinkedList() {
        dummyhead = new Node<>(null); 
        tail = dummyhead; 
        length = 0; 
    }

    public void insertFirst(T data) {
        Node<T> newnode = new Node<>(data); 
        newnode.next = dummyhead.getNext(); 
        dummyhead.next = newnode; 
        if(length == 0) tail = newnode; 
        length++; 
    }

    public void insertLast(T data) {
        Node<T> newnode = new Node<>(data);
        tail.next = newnode; 
        tail = newnode; 
        length++; 
    }

    public void insertAtPosition (T data, int position) {
        Node<T> newnode = new Node<>(data);
        Node<T> prev = dummyhead; 
        for(int i = 0; i < position; i++) {
            prev = prev.next;
        }
        newnode.next = prev.next; 
        prev.next = newnode; 
        if(newnode.next == null) tail = newnode; 
        length++; 
    }
    
}
