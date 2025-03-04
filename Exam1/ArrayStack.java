package Exam1;

public class ArrayStack {
	final int CAPACITY = 5;
	String[] stack;
	int size;
	int top;
	
	public ArrayStack() {
		stack = new String[CAPACITY]; 
		// Intializes a stack using an array and uses the capacity variable to delcare a fixed size
		top=-1;
		// With the top being out of index it goes to show we have an empty stack/array
		size=0; 
		// Also goes hand in hand with previous line, meaning our size = top + 1
	}
	
	// Runtime: O(1)
	public void push(String element) {
		if(size==CAPACITY){
			return;
		}
		stack[++top]=element;
		size++;
	}
	
	// Runtime: O(1)
	public String pop() {
		/*
		 * To use the pop method we must first check there is at least 1 element on the stack.
		 * Top has to equal at least 0 for there to be an element. If top = -1 the stack is empty. 
		 */
		if(top==-1){
			return null; 
		}
		/*
		 * Store the current top element into a string because we need this method to return it
		 */
		String temp = stack[top]; 
		/*
		 * The following step is optional as when we decrement the index of top, the next time the push 
		 * method is used it will override what was previously stored at the current index of top. 
		 * This is a good practice though in the case that a push method is not used procedding a pop. 
		 */
		stack[top]=null; 

		/*
		 * Decrement index of top and size as an element in being removed from the stack. 
		 */
		top--; 
		size--; 

		// Return the popped element stored by temp 
		return temp; 
	}
	
	// Runtime: O(1)
	public String peek() {
		if(top==-1){
			return null; 
		}
		return stack[top];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
}
