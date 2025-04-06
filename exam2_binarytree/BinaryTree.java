package exam2_binarytree;
import java.util.LinkedList;

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
		LinkedList<Node<E>> children = new LinkedList<>(); 
		if(node.left != null) children.addLast(node.left); 
		if(node.right != null) children.addLast(node.right);
		return children; 
	}
	
	public boolean isRoot(Node<E> node) {
		return node == root; 
	}
	
	public boolean isExternal(Node<E> node) {
		return node.right == null && node.left == null; 
		
	}
	
	public boolean isInternal(Node<E> node) {
		return node.right != null || node.left != null;  
	}
	
	public int nodeDepth(Node<E> node) {
		
	}
	
	public int treeHeight() {
		
	}
	
	public int size() {
		
	}
}
