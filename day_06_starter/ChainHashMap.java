package day_06_starter;

public class ChainHashMap<K,V> {
	final int CAPACITY = 101;
	LinkedList<Pair<K,V>>[] bucket;
	int size;
	
	public ChainHashMap() {
		bucket = (LinkedList<Pair<K,V>>[]) new LinkedList[CAPACITY];
		for(int i = 0; i<CAPACITY; i++) {
			bucket[i] = new LinkedList<Pair<K,V>>();
		}
		size = 0;		
	}
	
	public void put(Pair<K,V> pair) {
		int address = pair.getKey().hashCode() % CAPACITY;
		Node<Par<K,V>> curr = bucket[address].getFirst(); 
		while(curr!=null){
			if(curr.data.getKey() == pair.getKey()){
				curr.data.setValue(pair.getValue()); 
				return; 
			}
			curr = curr.next;
		}
		bucket[address].insertLast(pair);
		size++; 
	}
	
	public Pair<K,V> get(){
		return null;
	}
	
	public Pair<K,V> remove(){
		return null;
	}
	
	public LinkedList<K> keySet() {
		return null;
	}
	
	public LinkedList<Pair<K,V>> entrySet(){
		return null;
	}	
}
