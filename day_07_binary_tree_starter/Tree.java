package day_07_trees;
import  day_04_lists.LinkedList;

public class Tree<E> {
	
	TreeNode<E> root;
	int size;
	
	public E element(TreeNode<E> node) {
		if(node == null) return null;
		return node.data;
	}
	
	public TreeNode<E> getParent(TreeNode<E> node) {
		//return null if node == root
		return null;
	}
	
	public LinkedList<TreeNode<E>> getChildren(TreeNode<E> node) {
		
		return null;
	}
	
	
	public boolean isRoot(TreeNode<E> node) {
		return false;
	}
	
	public boolean isExternal(TreeNode<E> node) {
		return false;
	}
	
	public boolean isInternal(TreeNode<E> node) {
		return false;
	}
	
	public int nodeDepth(TreeNode<E> node) {
		return 0;
		
	}
	
	public int treeHeight() {
		return 0;
	}
	
	public int size() {
		return 0;
	}
	
	
	
	
}
