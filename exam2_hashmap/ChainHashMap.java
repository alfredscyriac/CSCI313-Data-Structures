package exam2_hashmap;

public class ChainHashMap<K,V> {
    private int capacity = 101; 
    private LinkedList<Pair<K,V>>[] arr; 
    private int size; 

    // Default constructor 
    @SuppressWarnings("unchecked")
    public ChainHashMap() {
        arr = (LinkedList<Pair<K, V>>[]) new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = new LinkedList<Pair<K, V>>();
        }
        size = 0;
    }

    // Custom capacity constructor 
    @SuppressWarnings("unchecked")
    public ChainHashMap(int customcapacity) {
        arr = (LinkedList<Pair<K, V>>[]) new LinkedList[customcapacity];
        for (int i = 0; i < customcapacity; i++) {
            arr[i] = new LinkedList<Pair<K, V>>();
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

    
}
