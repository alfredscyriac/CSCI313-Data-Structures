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
		return nodeDepthHelper(root, node, 0);
	}
	
	private int nodeDepth(Node<E> current, Node<E> target, int depth) {
		if (current == null) return -1;
		if (current == target) return depth;
	
		int left = nodeDepth(current.left, target, depth + 1);
		if (left != -1) return left;
	
		return nodeDepth(current.right, target, depth + 1);
	}
	
	public int treeHeight() {
		return treeHeightHelper(root);
	}

	private int treeHeightHelper(Node<E> node) {
		if (node == null) return -1;
		return 1 + Math.max(treeHeightHelper(node.left), treeHeightHelper(node.right));
	}
	
	public int size() {
		return size;
	}
}
