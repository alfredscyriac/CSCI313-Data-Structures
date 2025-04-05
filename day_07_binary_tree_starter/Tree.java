package day_07_binary_tree_starter;
import java.util.LinkedList;
import java.util.Queue;

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
		Queue<Node<E>> queue = new LinkedList<>(); 
		queue.add(root); 
		while(!queue.isEmpty()){
			Node<E> curr = queue.remove(); 
			if ( curr.left == target || curr.right == target ) {
				return curr; 
			}

			if (curr.left != null) queue.add(curr.left); 
			if (curr.right != null) queue.add(curr.right); 
		}
		return null; 
	}
	
	public LinkedList<Node<E>> getChildren(Node<E> node) {
		LinkedList<Node<E>> children = new LinkedList<>();
        if (node.left != null) children.add(node.left);
        if (node.right != null) children.add(node.right);
		if (node.left == null && node.right == null) return null; 
        return children;
	}
	
	public boolean isRoot(Node<E> node) {
		return node == root;
	}
	
	public boolean isExternal(Node<E> node) {
		return node.left == null && node.right == null;
	}
	
	public boolean isInternal(Node<E> node) {
		return node.left != null || node.right != null;
	}
	
	public int nodeDepth(Node<E> node) {
		int depth = 0;
		while(getParent(node) != null){
			node = getParent(node); 
			depth+=1; 
		}
		return depth; 
	}
	
	public int treeHeight() {
		return 0;
	}
	
	public int size() {
		return 0;
	}
}
