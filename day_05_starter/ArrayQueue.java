package day_05_starter;

public class ArrayQueue {
	String[] queue;
	int size;
	final int CAPACITY = 5;
	int front;
	int rear;
	
	public ArrayQueue() {
		queue=new String[CAPACITY];
		front=0;
		rear=0;
		size=0; 
	}
	
	/**
	 * This methods can also be called "add" or "offer".
	 * Places an element at the end of the queue.
	 * What is the runtime?
	 * @param element
	 */
	public void enqueue(String element) {
		if(size==CAPACITY){
			return;
		}
		queue[rear]=element;
		rear = (rear+1)%CAPACITY; 
		size++; 
	}
	
	/**
	 * This methods can also be called "pop" or "remove".
	 * Removes the element at the front of the queue.
	 * If queue is empty, it returns null.
	 * What is the runtime?
	 * @return E
	 */
	public String dequeue() {
		if (isEmpty()){
			return null;
		}
		String temp = queue[front];
		queue[front] = null;
		front++;
		size--;
		return temp;
	}
	
	/**
	 * This methods can also be called "peek" or "element".
	 * Returns but does not remove the element at the front of the queue.
	 * If queue is empty, it returns null.
	 * What is the runtime?
	 * @return E
	 */
	public String front() {
		if (isEmpty()) {
			return null;
		}
		return queue[front];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
		
	public int size() {
		return size;
	}
	
	
}
