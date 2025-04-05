package exam2_hashmap;

public class Node<Pair> {
    private Pair data; 
    private Node<Pair> next; 

    public Node(Pair data) {
        this.data = data; 
        this.next = null; 
    }

    public Pair getData() {
        return data; 
    }

    public void setData(Pair data) {
        this.data = data; 
    }

    public Node<Pair> getNext() {
        return next; 
    }

    public void setNext(Node<Pair> next) {
        this.next = next; 
    }    
}
