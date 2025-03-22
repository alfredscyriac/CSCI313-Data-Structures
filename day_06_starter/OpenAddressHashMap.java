package day_06_starter;

@SuppressWarnings("unchecked")
public class OpenAddressHashMap<K,V> {
    int CAPACITY = 101; 
    Pair<K,V>[] table; 
    int size; 
    public OpenAddressHashMap() {
        table = new Pair[CAPACITY]; 
        size = 0; 
    } 
    
    // Hash Function for convenience and less repititon 
    public int hashFunc(K key) {
        int hashCode = key.hashCode() % CAPACITY; 
        return hashCode; 
    }

    public void put(Pair<K,V> pair){
        K key = pair.getKey(); 
        V value = pair.getValue(); 
        int index = hashFunc(key); 

        // If table[index] is not null theres two approaches 
        // (1) the pair stored has the same key if it does just update its value 
        // (2) another is stored here then we must search for the next avialable index by linear probing
        while(table[index]!=null && size!=CAPACITY-1) {
            if(table[index].getKey().equals(key)) {
                table[index].setValue(value);
                return;
            }
            else {
                index = (index + 1) % CAPACITY; 
            }
        }

        // Once an availabe index is found add the pair there and increment size 
        table[index] = pair; 
        size++; 
    }

    public Pair<K,V> get(K key) {
        // Find what index key should be at if it was not affected by linear probing 
        int index = hashFunc(key); 
        
        // Check if that index does have the key we are looking for, if it does return the pair 
        if (table[index].getKey().equals(key)) {
            return table[index]; 
        }

        // Worst case iterate through the entire table to check if the key can be found at any other index 
        // If the end of the table is reached and we don't find it in ANY index we know it does not exist
        else {
            for(int i = 0; i < table.length; i++) {
                if(table[i].getKey().equals(key)) {
                    return table[i];
                }
            }
            return null; 
        }
    }

    public Pair<K,V> remove(K key) {
        // Find what index key should be at if it was not affected by linear probing 
        int index = hashFunc(key); 

        // Check if that index does have the key we are looking for, if it does remove and return in
        if(table[index].getKey().equals(key)) {
            Pair<K,V> removePair = table[index]; 
            table[index] = null; 
            size--; 
            return removePair; 
        }

        // Worst case iterate through the entire table to check if the key can be found at any other index
        // If the end of the table is reached and we don't find it in ANY index we know it does not exist 
        else {
            for(int i =0; i<table.length; i++){
                if(table[i].getKey().equals(key)) {
                    Pair<K,V> removePair = table[i]; 
                    table[index] = null; 
                    size--; 
                    return removePair;
                }
            }
            return null;
        }
    }

    public LinkedList<K> keySet() {
        // Create new linked list to store all the keys at once 
        LinkedList<K> allKeys = new LinkedList<>(); 

        // Iterate through the table and every time an index is not null, append that key to linked list
        for(int i=0; i<table.length; i++) {
            if(table[i]!=null){
                allKeys.insertLast(table[i].getKey());
            }
        }

        // return linked list
        return allKeys; 
    }

    public LinkedList<Pair<K,V>> entrySet() {
         // Create new linked list to store all the pairs at once
        LinkedList<Pair<K,V>> allPairs  = new LinkedList<>(); 

        // Iterate through the table and every time an index is not null, append that pair to linked list
        for(int i=0; i<table.length; i++) {
            if(table[i]!=null){
                allPairs.insertLast(table[i]);
            }
        }

        // return linked list 
        return allPairs; 
    }
}
