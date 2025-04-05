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

    public boolean isEmpty() {
        return length == 0; 
    }

    public Node<T> getFirst() {
        return isEmpty() ? null : dummyhead.next; 
    }

    public Node<T> getLast() {
        return isEmpty() ? null : tail; 
    }

    public int getLength() {
        return length; 
    }

    public void removeFirst() {
        if(isEmpty()) return; 
        dummyhead.next = dummyhead.next.next;
        length--; 
        if (length==0) tail = dummyhead;  
    }

    public void removeLast() {
        if(isEmpty()) return;

        Node<T> prev = dummyhead; 
        while (prev.next != tail) {
            prev = prev.next; 
        }
        prev.next = null; 
        tail = prev; 
        length--; 
    }

    public void removeAtPosition(int position) {
        if(position < 0 || position >= length) throw new IndexOutOfBoundsException();
        Node<T> prev = dummyhead; 
        for(int i = 0; i < position; i++) {
            prev = prev.next;
        }
        if(prev.next == tail) tail = prev; 
        prev.next = prev.next.next; 
        length--; 
    }
    
}
