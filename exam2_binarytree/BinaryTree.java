package exam2_binarytree;
import java.util.LinkedList;
import java.util.Queue;

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
		if(node == root || node == null || root == null) return null;  
		LinkedList<Node<E>> list = new LinkedList<>(); 
		list.add(root); 
		while(!list.isEmpty()){
			Node<E> curr = list.remove(); 
			if ( curr.left == node || curr.right == node ) {
				return curr; 
			}

			if (curr.left != null) list.add(curr.left); 
			if (curr.right != null) list.add(curr.right); 
		}
		return null; 
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

	private int nodeDepthHelper(Node<E> current, Node<E> target, int depth) {
		if (current == null) return -1;
		if (current == target) return depth;
	
		int left = nodeDepthHelper(current.left, target, depth + 1);
		if (left != -1) return left;
	
		return nodeDepthHelper(current.right, target, depth + 1);
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

	// Level by level
	public void breadthFirstTraversal() {
		if(root == null) return; 

		Queue<Node<E>> queue = new LinkedList<>(); 
		queue.add(root); 

		while(!queue.isEmpty()) {
			Node<E> current = queue.poll();
			System.out.print(current.data + " ");
			if (current.left != null) queue.add(current.left);
			if (current.right != null) queue.add(current.right);
		}
		System.out.println();
	}

	// Left --> Root --> Right
	public void dfsInorderTraversal(Node<E> node) {
		if(node == null) return; 

		dfsInorderTraversal(node.left); 
		System.out.print(node.data + " ");
		dfsInorderTraversal(node.right);
	}

	// Root --> Left --> Right
	public void dfsPreorderTraversal(Node<E> node) {
		if(node == null) return; 

		System.out.println(node.data + " "); 
		dfsPreorderTraversal(node.left);
		dfsInorderTraversal(node.right);
	}

	// Left --> Right --> Root
	public void dfsPostorderTraversal(Node<E> node) {
		if(node == null) return; 

		dfsPostorderTraversal(node.left);
		dfsPostorderTraversal(node.right);
		System.out.println(node.data + " ");
	}
}
