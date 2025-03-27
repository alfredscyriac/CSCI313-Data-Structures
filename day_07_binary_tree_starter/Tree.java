package day_07_binary_tree_starter;
import java.util.LinkedList;

public class Tree<E> {
	
	Node<E> root;
    int size;

    public Tree(E rootData) {
        root = new Node<>(rootData);
        size = 1;
    }
	
	public E element(Node<E> node) {
        if (node == null) return null;
        return node.data;
    }
	
	public Node<E> getParent(Node<E> target) {
		if(target == root || target == null || root == null) return null;  
		LinkedList<Node<E>> list = new LinkedList<>(); 
		list.add(root); 
		while(!list.isEmpty()){
			Node<E> curr = list.pop(); 
			if ( curr.left == target || curr.right == target ) {
				return curr; 
			}

			if (curr.left != null) list.add(curr.left); 
			if (curr.right != null) list.add(curr.right); 
		}
		return null; 
	}
	
	public LinkedList<Node<E>> getChildren(Node node) {
		LinkedList<Node<E>> children = new LinkedList<>();
        if (node.left != null) children.add(node.left);
        if (node.right != null) children.add(node.right);
        return children;
	}
	
	public boolean isRoot(Node node) {
		return node == root;
	}
	
	public boolean isExternal(Node node) {
		return node.left == null && node.right == null;
	}
	
	public boolean isInternal(Node node) {
		return node.left != null || node.right != null;
	}
	
	public int nodeDepth(Node node) {
		return 0;
		
	}
	
	public int treeHeight() {
		return 0;
	}
	
	public int size() {
		return 0;
	}
}
