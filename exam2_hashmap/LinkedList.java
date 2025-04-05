package exam2_hashmap;

public class LinkedList<T> {
    private Node<T> dummyHead; 
    private Node<T> tail; 
    private int length;
    
    public LinkedList() {
        dummyHead = new Node<>(null); 
        tail = dummyHead; 
        length = 0; 
    }

    public void insertFirst(T data) {
        Node<T> newnode = new Node<>(data); 
        newnode.next = dummyHead.getNext(); 
        dummyHead.next = newnode; 
        if(length == 0) tail = newnode; 
        length++; 
    }
    
}
