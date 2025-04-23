package avl_trees; 

public class AVLNode {
    int data; 
    AVLNode parent; 
    AVLNode left; 
    AVLNode right; 
    int leftHeight; 
    int rightHeight; 
    int height; 

    public AVLNode(int data) {
        this.data = data; 
        this.parent = null; 
        this.left = null; 
        this.right = null; 
        this.leftHeight = -1; 
        this.rightHeight = -1; 
        this.height = 0; 
    }

    public void updateHeights() { 
        this.leftHeight = (left == null ? -1 : left.height); 
        this.rightHeight = (right == null ? -1: right.height); 
        this.height = Math.max(leftHeight, rightHeight) + 1; 
    }

    public int balance() {
        return Math.abs(leftHeight - rightHeight); 
    }

    public AVLNode getParent() {
        if(parent == null) return null; 
        else return parent; 
    }

    public int getParentData() {
        if(parent == null) return -1; 
        else return parent.data; 
    }

    public int getHeight() {
        return height; 
    }

    public int getLeftHeight() {
        return leftHeight; 
    }

    public AVLNode getLeftNode() {
        return left; 
    }

    public int getRightHeight() {
        return rightHeight; 
    }

    public AVLNode getRightNode() {
        return right; 
    }
}
