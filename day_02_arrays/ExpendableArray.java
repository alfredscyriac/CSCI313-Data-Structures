package day_02_arrays;

public class ExpendableArray {
	private int size;
	private int capacity;
	private String[] array;
	
	public ExpendableArray(){//default constructor
		size=0; 
		capacity=5; 
		array= new String[capacity];
	}
	
	public ExpendableArray(int cap){
		size=0; 
		capacity=cap; 
		array= new String[capacity];
	}
	
	private void fillArray() {
		for(int i=0; i<capacity; i++){
			array[i]=null; 
		}
	}

	private boolean isAlmostFull() {
		if(size>=capacity/2){
			return true; 
		}
		else{
			return false; 
		}
	}
	
	private boolean isAlmostEmpty() {
		if(size<capacity/2){
			return true; 
		}
		else{
			return false; 
		}	
	}
	
	private void doubleCapacity() {
		
	}
	
	private void halveCapacity() {
		
	}
	
	private void copyArray() {
		
	}
	
	public String get(int index) {
		return null;
	}
	
	public void add(String e) {
		
	}
	
	public void remove() {
		
	}
	
	public void remove(int index) {
		
	}
	
	public boolean isEmpty() {
		return true;
	}
	
	public String toString() {
		return null;
	}
	
	public int getSize() { return this.size; }
	public int getCapacity() { return this.capacity; }
}
