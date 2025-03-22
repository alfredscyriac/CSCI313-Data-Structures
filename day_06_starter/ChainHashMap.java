package day_06_starter;

public class ChainHashMap<K,V> {
	final int CAPACITY = 101;
	LinkedList<Pair<K,V>>[] bucket;
	int size;
	
	@SuppressWarnings("unchecked")
	public ChainHashMap() {
		bucket = (LinkedList<Pair<K,V>>[]) new LinkedList[CAPACITY];
		for(int i = 0; i<CAPACITY; i++) {
			bucket[i] = new LinkedList<Pair<K,V>>();
		}
		size = 0;		
	}
	
	public void put(Pair<K,V> pair) {
		// Identify which index the pair should be placed 
		int address = pair.getKey().hashCode() % CAPACITY;

		// Find the first node in that index 
		Node<Pair<K,V>> curr = bucket[address].getFirst(); 

		// Check to see if the key already exists in the linked list, if it does override it 
		while(curr!=null){
			if(curr.data.getKey() == pair.getKey()){
				curr.data.setValue(pair.getValue()); 
				return; 
			}
			curr = curr.next;
		}

		// If the key does not already exist append the pair to the end and increment size 
		bucket[address].insertLast(pair);
		size++; 
	}
	
	public Pair<K,V> get(K key){
		// Locate which index the key should belong to using the hash function
		int address = key.hashCode() % CAPACITY;

		// Node to traverse linked list 
		Node<Pair<K,V>> curr = bucket[address].getFirst();

		// Traverse until the end of the linked list
		while(curr != null) {
			// Check if the key at current traversal is the one we need to get 
			// If it is then return the data of the node else continue traversing 
			if(curr.data.getKey() == key) {
				return curr.data;
			}
			curr = curr.next;
		}

		// If the end of the linked list is reach that means the key is not in the linked list
		return null; 
	}
	
	public Pair<K,V> remove(K key){
		// Locate which index the key should belong to using the hash function
		int address = key.hashCode() % CAPACITY; 
		// Trailing pointer to the node we want to remove + return 
		Node<Pair<K,V>> curr = bucket[address].getFirst();
 
		while (curr.next != null) {
			// Check each node to see if key matches they key we want to remove
			if (curr.next.data.getKey().equals(key)) {
				// If the node we are looking to is found then create a pointer to it
				Node<Pair<K,V>> nodeFound = curr.next; 
				// Update curr.next to SKIP aka REMOVE the node we are looking for from linked list
				curr.next = curr.next.next;
				// In case the node we are removing was the tail, then update the tail 
				if (nodeFound == bucket[address].tail) {
					bucket[address].tail = curr; 
				}
				// Decrement size as a node was removed and return the pointer to the found node.data
				// .data because the function's return type is a pair not a node 
				size--;
				return nodeFound.data;
			}
			curr = curr.next; 
		}
		return null; 
	}
	
	public LinkedList<K> keySet() {
		// Create new linked list to store all the keys at once 
		LinkedList <K> allKeys = new LinkedList<>();

		// Iterate through each index and each node in each index, add all keys to allKeys
		for (int i = 0; i < bucket.length; i++){
			Node<Pair<K,V>> curr = bucket[i].dummyhead.next;
			while (curr != null) {
				allKeys.insertLast(curr.data.getKey());
				curr = curr.next;
			}
		}

		// After iterating through each index and each node return the newly created linked list
		return allKeys; 
	}
	
	public LinkedList<Pair<K,V>> entrySet(){
		// Create new linked list to store all the key value pairs at once 
		LinkedList<Pair<K,V>> allPairs = new LinkedList<>(); 

		// Iterate through each index and each node in each index, add all pairs to allPairs
		for (int i = 0; i < bucket[i].length; i++) {
			Node<Pair<K,V>> curr = bucket[i].dummyhead.next;
			while (curr != null) {
				allPairs.insertLast(curr.data);
				curr = curr.next;
			}
		}

		// After iterating through each index and each node return the newly created linked list
		return allPairs; 
	}	
}
