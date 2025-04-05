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
    
}
