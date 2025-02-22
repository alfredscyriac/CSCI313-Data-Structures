package day_05_starter;
import java.util.LinkedList;

public class ListStack {
	private LinkedList<String> stack;
	
	public ListStack() {
		stack = new LinkedList<>();
	}
	
	/**
	 * Places an element at the top of the stack.
	 * What is the runtime? 
	 * Runtime: O(1)
	 * @param element
	 */
	public void push(String element) {
		stack.addFirst(element);
	}
	
	/**
	 * Removes the element at the top of the stack.
	 * If stack is empty, it returns null.
	 * What is the runtime?
	 * Runtime: O(1)
	 * @return String
	 */
	public String pop() {
		if(stack.isEmpty()){
			return null;
		}
		else{ 
			String temp = stack.getFirst();
			stack.removeFirst();
			return temp;
		}
	}
	
	/**
	 * Returns but does not remove the element at the top of the stack.
	 * If stack is empty, it returns null.
	 * What is the runtime?
	 * Runtime: O(1)
	 * @return String
	 */
	public String peek() {
		if(stack.isEmpty()){
			return null;
		}
		return stack.getFirst();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
}
