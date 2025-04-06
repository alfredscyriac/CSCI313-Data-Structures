package exam2_hashmap;

import javax.management.RuntimeErrorException;

public class OpenAddressHashMap<K,V> {
    int capacity = 101; 
    Pair<K,V>[] bucket;
    int size; 

    public OpenAddressHashMap() {
        bucket = new Pair[capacity];
        size = 0; 
    }

    public int hashfunction(K key) {
        int hash = 0; 
        char[] keyChars = key.toString().toCharArray(); 
        
        for(int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i]; 
            hash = (hash + asciiValue * 23) % capacity; 
        }

        return hash; 
    }

    public void put(Pair<K,V> pair) {
        K key = pair.getKey();
        V value = pair.getValue();
        int address = hashfunction(key);
        int start = address;

        while (bucket[address] != null) {
            if(bucket[address].getKey().equals(key)) {
                bucket[address].setValue(value); 
                return; 
            }
            
            address = (address + 1) % capacity;

            if (address == start) {
                throw new RuntimeException("HashMap is full");
            }
        }

        bucket[address] = pair;
        size++;
    }

    public Pair<K,V> get(K key) {
        int address = hashfunction(key);
	    
        for (int i = 0; i < capacity; i++) {
            int probe = (address + i) % capacity;
    
            if (bucket[probe] != null && bucket[probe].getKey().equals(key)) {
                return bucket[probe];
            }
        }

	    return null;
    }

    public Pair<K,V> remove(K key) {
        int address = hashfunction(key); 
        int start = address; 

        while (bucket[address] != null) {
            if (bucket[address].getKey().equals(key)) {
                Pair<K, V> removed = bucket[address];
                bucket[address] = null;
                size--;
                return removed;
            }

            address = (address + 1) % capacity;
            
            if (address == start) break;
        }

        return null;

    }

    public LinkedList<K> keySet() {
        LinkedList<K> keyset = new LinkedList<>();
        for (int i = 0; i < capacity; i++) {
            if (bucket[i] != null) {
                keyset.insertLast(bucket[i].getKey());
            }
        }
        return keyset;
    }

    public LinkedList<Pair<K,V>> entrySet() {
        LinkedList<Pair<K, V>> allPairs = new LinkedList<>();
        for (int i = 0; i < capacity; i++) {
            if (bucket[i] != null) {
                allPairs.insertLast(bucket[i]);
            }
        }
        return allPairs;

    }    
}
