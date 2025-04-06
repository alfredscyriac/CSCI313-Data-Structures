package exam2_binarytree;

public class Node<E> {
    E data;
    Node<E> left;
    Node<E> right;

    public Node(E data) {
        this.data = data;
        left = null;
        right = null;
    }
}
