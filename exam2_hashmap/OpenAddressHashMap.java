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
        int address = hashfunction(key); 

        for(int i = 0; i < capacity; i++) {
            int probe = (address + i) % capacity; 

            if(bucket[probe] == null) {
                bucket[probe] = pair; 
                size++; 
                return; 
            }
            else if(bucket[probe].getKey().equals(key)) {
                bucket[probe] = pair; 
                return; 
            }
        }
        throw new RuntimeException("HashMap is full. Remove pairs and try again.");

    }

    public Pair<K,V> get(K key) {
        int address = hashfunction(key); 

        for(int i = 0; i < capacity; i++){
            int probe = (address + i) % capacity;

            if(bucket[probe] == null) {
                return null; 
            }

            else if (bucket[probe].getKey().equals(key)) {
                return bucket[probe]; 
            }

        }

        return null; 
    }

    public Pair<K,V> remove(K key) {

    }

    public LinkedList<K> keySet() {

    }

    public LinkedList<Pair<K,V>> entrySet() {

    }    
}
