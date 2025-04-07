package exam2_bst;

public class BST {
    Node root;
	
	public BST() {
		root = null;
	}

    public void insert(int x) {
        if(root == null) root = new Node(x); 
        else insertHelper(root, x);
    }

    public void insertHelper(Node node, int x) {
        if(x >= node.data) {
            if(node.right == null) node.right = new Node(x); 
            else insertHelper(node.right, x);
        }
        else {
            if(node.left == null) node.left = new Node(x); 
            else insertHelper(node.left, x);
        }
    }

    public Node search(int x) {

    }

    public Node searchHelper(Node node, int x) {

    }

    public Node delete(int x) {

    }

    public Node deleteHelper(Node node, int x) {

    }

    public int maxValue(Node node) {

    }
    
}
