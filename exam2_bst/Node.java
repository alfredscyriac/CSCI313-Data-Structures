package exam2_bst;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public String toString() {
		return data+"";
	}
}
