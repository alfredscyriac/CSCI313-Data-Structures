package exam2_heaps;

public class MinHeap {
	int[] heapArray;
	int size; //also last element
	int capacity;
	
	public MinHeap() {
		capacity = 10;
		size = 0;
		heapArray = new int[capacity];
	}
	
	public MinHeap(int cap) {
		capacity = cap;
		size = 0;
		heapArray = new int[capacity];
	}
	
	public void insertMinHeap(int num) {
		if(size == capacity-1) {
			throw new IllegalStateException("Heap is full, cannot insert "+num);
		}
		size++;
		heapArray[size] = num;
		heapifyUp(size);
	}
	
	public int removeMinHeap() {
		if(size == 0) {
			throw new IllegalStateException("Heap is empty, no value to remove.");
		}
		int ans = heapArray[1];
		heapArray[1] = heapArray[size];
		size--;
		heapifyDown();
		return ans;
	}
	
	public void heapifyUp(int index) {
		int currIndex = index;
		while(currIndex > 1) {
			int parentIndex = currIndex / 2;
			if(heapArray[parentIndex] < heapArray[currIndex]) {
				break;
			}
			swap(currIndex, parentIndex);
			currIndex = parentIndex;
		}
	}
	
	public void heapifyDown() {
		int currIndex = 1;
		int smallestChildIndex;
		int leftChildIndex = currIndex * 2;
		int rightChildIndex = currIndex * 2 + 1;
		
		if(leftChildIndex <= size && rightChildIndex <= size) {
			if(heapArray[leftChildIndex] < heapArray[rightChildIndex]) {
				smallestChildIndex = leftChildIndex;
			} else {
				smallestChildIndex = rightChildIndex;
			}
		} 
		else if(leftChildIndex <= size) {
			smallestChildIndex = leftChildIndex;
		} 
		else if(rightChildIndex <= size) {
			smallestChildIndex = rightChildIndex;
		} 
		else {
			return;
		}
		
		if(heapArray[currIndex] > heapArray[smallestChildIndex]) {
			swap(currIndex, smallestChildIndex);
		}
	}
	
	public void swap(int i, int j) {
		int temp = heapArray[i];
		heapArray[i] = heapArray[j];
		heapArray[j] = temp;
	}
	
	/**
	 * Give a string representation of the heap array
	 * Example: [1,2,3,4,5]
	 */
	public String toString() {
		String ans = "[";
		for(int i = 1; i <= size; i++) {
			ans += heapArray[i];
			if(i != size) ans += ", ";
		}
		ans += "]";
		return ans;
	}
}
