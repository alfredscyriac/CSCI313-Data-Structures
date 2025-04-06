package exam2_binarytree;

public class BinaryTree<E> {
	
	Node<E> root;
	int size;
	
    public BinaryTree(E rootData) {
		root = new Node<>(rootData); 
		size = 1;
    }

	public E element(Node<E> node) {
		return node.data; 
	}
	
	public Node<E> getParent(Node<E> node) {
		
	}
	
	public LinkedList<Node<E>> getChildren(Node<E> node) {
		
	}
	
	
	public boolean isRoot(Node<E> node) {
		
	}
	
	public boolean isExternal(Node<E> node) {
		
	}
	
	public boolean isInternal(Node<E> node) {
		
	}
	
	public int nodeDepth(Node<E> node) {
		
	}
	
	public int treeHeight() {
		
	}
	
	public int size() {
		
	}
}
