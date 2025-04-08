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
        if(x > node.data) {
            if(node.right == null) node.right = new Node(x); 
            else insertHelper(node.right, x);
        }
        else {
            if(node.left == null) node.left = new Node(x); 
            else insertHelper(node.left, x);
        }
    }

    public Node search(int x) {
        return searchHelper(root, x);
    }

    public Node searchHelper(Node node, int x) {
        if(node == null) return null; 

        if(node.data == x) return node; 

        if(x > node.data) return searchHelper(node.right,x); 
        else return searchHelper(node.left, x);        
    }

    public Node delete(int x) {
        return deleteHelper(root,x); 
    }

    public Node deleteHelper(Node node, int x) {
        if (node == null) return null;
    
        if (x < node.data) {
            node.left = deleteHelper(node.left, x);
        } else if (x > node.data) {
            node.right = deleteHelper(node.right, x);
        } else {
            // Case 1: Leaf node
            if (node.left == null && node.right == null) {
                return null;
            }
            // Case 2: One child
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // Case 3: Two children
            else {
                node.data = maxValue(node.left);
                node.left = deleteHelper(node.left, node.data);
            }
        }
    
        return node;
    }
    
    public int maxValue(Node node) {
        if(node.right == null) return node.data; 
        else return maxValue(node.right); 
    }
    
}
