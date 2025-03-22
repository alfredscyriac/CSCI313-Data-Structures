package day_06_starter;

@SuppressWarnings("unchecked")
public class OpenAddressHashMap<K,V> {
    int CAPACITY = 101; 
    Pair<K,V>[] table; 
    int size; 
    public OpenAddressHashMap<K,V>() {
        table = new Pair[CAPACITY]; 
        size = 0; 
    } 
    
    // Hash Function for convenience and less repititon 
    public int hashFunc(K key) {
        int hashCode = key.hashCode() % CAPACITY; 
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
        if (table[index].getKey() == key) {
            return table[index]; 
        }

        // Worst case iterate through the entire table to check if the key can be found at any other index 
        // If the end of the table is reaches and we don't find it in ANY index we know it does not exist
        else {
            for(int i = 0; i < table.length; i++) {
                if(table[i].getKey() == key) {
                    return table[i];
                }
            }
            return null; 
        }
    }
}
