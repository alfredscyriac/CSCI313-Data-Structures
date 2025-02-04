package day_02_arrays;

public class ExpendableArray {
	private int size;
	private int capacity;
	private String[] array;
	
	public ExpendableArray(){//default constructor
		this.size=0; 
		this.capacity=5; 
		this.array = new String[capacity];
		this.fillArray();
	}
	
	public ExpendableArray(int cap){
		this.size=0; 
		this.capacity=cap; 
		this.array = new String[capacity];
		this.fillArray();
	}
	
	private void fillArray() {
		for(int i=0; i<this.capacity; i++){
			this.array[i]=null; 
		}
	}

	private boolean isAlmostFull() {
		if((100.0*size)/capacity>=70.0){
			return true; 
		}
		else{
			return false; 
		}
	}
	
	private boolean isAlmostEmpty() {
		if((100.0*size)/capacity<=30.0){
			return true; 
		}
		else{
			return false; 
		}
	}
	
	private void doubleCapacity() {
		this.capacity*=2; 
		this.copyArray();
	}
	
	private void halveCapacity() {
		this.capacity=Math.max(5,this.capacity/2);
		this.copyArray(); 
	}
	
	private void copyArray() {
		String[] tempArray = new String[capacity]; 
		for(int i=0; i<this.capacity;i++){
			tempArray[i]=this.array[i];
		}
		this.array=tempArray; 
	}
	
	public String get(int index) {
		return this.array[index]; 
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
