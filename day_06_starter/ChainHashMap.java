package day_06_hashmaps;

public class ChainHashMap<K,V> {
	final int CAPACITY = 101;
	LinkedList<Pair<K,V>>[] bucket;
	int size;
	
	public ChainHashMap() {
		bucket = (LinkedList<Pair<K,V>>[]) new LinkedList[CAPACITY];
		size = 0;		
	}
	
	public void put(Pair<K,V> pair) {
		
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
