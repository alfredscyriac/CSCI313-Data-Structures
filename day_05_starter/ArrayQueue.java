package day_05_queue_stack;

public class ArrayQueue {
	String[] queue;
	int size;
	final int CAPACITY = 5;
	int front;
	int rear;
	
	public ArrayQueue() {
		
	}
	
	/**
	 * This methods can also be called "add" or "offer".
	 * Places an element at the end of the queue.
	 * What is the runtime?
	 * @param element
	 */
	public void enqueue(String element) {
		
	}
	
	/**
	 * This methods can also be called "pop" or "remove".
	 * Removes the element at the front of the queue.
	 * If queue is empty, it returns null.
	 * What is the runtime?
	 * @return E
	 */
	public String dequeue() {
		return null;
	}
	
	/**
	 * This methods can also be called "peek" or "element".
	 * Returns but does not remove the element at the front of the queue.
	 * If queue is empty, it returns null.
	 * What is the runtime?
	 * @return E
	 */
	public String front() {
		return null;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
		
	public int size() {
		return size;
	}
	
	
}
