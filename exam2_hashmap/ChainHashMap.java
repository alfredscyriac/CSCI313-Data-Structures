package exam2_hashmap;

public class ChainHashMap<K,V> {
    private int capacity = 101; 
    private LinkedList<Pair<K,V>>[] bucket; 
    private int size; 

    // Default constructor 
    @SuppressWarnings("unchecked")
    public ChainHashMap() {
        bucket = (LinkedList<Pair<K, V>>[]) new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            bucket[i] = new LinkedList<Pair<K, V>>();
        }
        size = 0;
    }

    // Custom capacity constructor 
    @SuppressWarnings("unchecked")
    public ChainHashMap(int customcapacity) {
        bucket = (LinkedList<Pair<K, V>>[]) new LinkedList[customcapacity];
        for (int i = 0; i < customcapacity; i++) {
            bucket[i] = new LinkedList<Pair<K, V>>();
        }
        size = 0;
    }

    private int hashfunction(K key) {
        int hash = 0; 
        char[] keyChars = key.toString().toCharArray(); 
        
        for(int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i]; 
            hash = (hash + asciiValue * 23) % capacity; 
        }

        return hash; 
    }

    public void put(Pair<K,V> pair) {
        int address = hashfunction(pair.getKey());

        Node<Pair<K,V>> curr = bucket[address].getFirst(); 

        while(curr != null ) {
            if(curr.data.getKey().equals(pair.getKey())) {
                curr.data.setValue(pair.getValue());
                return; 
            }
            curr = curr.next; 
        }

        bucket[address].insertLast(pair);
        size++; 
    }

    public Pair<K,V> get(K key) {
        int address = hashfunction(key); 

        Node<Pair<K,V>> curr = bucket[address].getFirst();

        while (curr != null) {
            if(curr.data.getKey().equals(key)) {
                return curr.data;
            }
            curr = curr.next; 
        }

        return null; 
    }

    public Pair<K,V> remove(K key) {
        int address = hashfunction(key);

        LinkedList<Pair<K, V>> currBucket = bucket[address]; 

        if(currBucket.isEmpty()) return null; 

        Node<Pair<K,V>> prevNode = currBucket.dummyhead;
        Node<Pair<K,V>> currNode = prevNode.next; 

        while (currNode != null ){
            if(currNode.data.getKey().equals(key)) { 
                if(currNode == currBucket.tail) {
                    currBucket.tail = prevNode; 
                }
                Pair<K,V> removedNode = currNode.data;
                prevNode.next = currNode.next; 
                size--; 
                return removedNode; 
            }
            prevNode = currNode; 
            currNode = currNode.next; 
        }

        return null; 
    }

    
}
