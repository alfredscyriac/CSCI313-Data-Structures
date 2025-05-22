package stacksandqueues;
import java.util.LinkedList;

public class ListQueue {
	LinkedList<String> queue;
	//capacity is not necessary
	//size can be implied by the list's length
	//front and rear can be implied by list's head and tail
	
	public ListQueue() {
		queue=new LinkedList<>();
	}
	
	// Runtime: O(1)
	public void enqueue(String element) {
		queue.addLast(element);
	}
	
	// Runtime: O(1)
	public String dequeue() {
		if(queue.isEmpty()){
			return null;
		}
		String temp = queue.getFirst();
		queue.removeFirst();
		return temp;
	}
	
	// Runtime: O(1)
	public String front() {
		if(queue.isEmpty()){
			return null;
		}
		return queue.getFirst();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
		
	public int size() {
		return queue.size();
	}
}
